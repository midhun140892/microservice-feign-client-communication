package com.example.employee.service;

import com.example.employee.response.AddressResponse;
import com.example.employee.response.EmployeeResponse;
import com.example.employee.entity.Employee;
import com.example.employee.feignclient.AddressClient;
import com.example.employee.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressClient addressClient;


    public EmployeeResponse findEmployeeById(String id) {
//        feign client call to Address microservice
        ResponseEntity<AddressResponse> addressResponse = addressClient.getAddressByEmployeeId(id);
//        feign client call end
        Employee employee = employeeRepository.findEmployeeById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        employeeResponse.setAddress(addressResponse.getBody());
        return employeeResponse;
    }
}
