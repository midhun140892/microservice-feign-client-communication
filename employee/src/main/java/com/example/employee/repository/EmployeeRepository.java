package com.example.employee.repository;

import com.example.employee.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
    @Query("{'empId' :'?0'}")
    Employee findEmployeeById(String empId);
}
