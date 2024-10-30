package com.example.address.repository;

import com.example.address.entity.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AddressRepository extends MongoRepository<Address,String> {
    @Query("{empId : '?0'}")
    Address findAddressById(String empId);
}
