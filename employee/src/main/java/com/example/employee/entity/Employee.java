package com.example.employee.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Data
@Document(collection = "Employee")
public class Employee {

    @NonNull
    String empId;

    @NonNull
    String name;

    @NonNull
    int age;
}
