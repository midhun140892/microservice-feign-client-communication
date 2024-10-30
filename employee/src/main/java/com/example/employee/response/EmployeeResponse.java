package com.example.employee.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeResponse {
    String empId;
    String name;
    int age;
    AddressResponse address;
}
