package com.example.address.service;

import com.example.address.entity.Address;
import com.example.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address findAddressById(String empId) {
        return addressRepository.findAddressById(empId);
    }
}
