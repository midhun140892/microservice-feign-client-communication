package com.example.address.controller;

import com.example.address.entity.Address;
import com.example.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable("id") String id) {
        Address address = addressService.findAddressById(id);
        return ResponseEntity.status(200).body(address);
    }
}
