package com.example.address.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Data
@Document(collection = "Address")
public class Address {

    @NonNull
    String empId;
    @NonNull
    String city;
    @NonNull
    String state;
    @NonNull
    String pincode;
}
