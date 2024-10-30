package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.response.EmployeeResponse;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @GetMapping("{id}")
    public ResponseEntity<EmployeeResponse> getEmployee(@PathVariable("id") String id) {
            EmployeeResponse employeeResponse = employeeService.findEmployeeById(id);
            return ResponseEntity.status(200).body(employeeResponse);
    }
}
