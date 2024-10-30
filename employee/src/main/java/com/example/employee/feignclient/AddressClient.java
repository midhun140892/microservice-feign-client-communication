package com.example.employee.feignclient;

import com.example.employee.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address-service", url = "http://localhost:8081", path = "/address-service")
public interface AddressClient {
    @GetMapping("/api/address/{id}")
    public ResponseEntity<AddressResponse>
    getAddressByEmployeeId(@PathVariable("id") String id);
}
