package com.springjpa.springjpademo.controller;

import com.springjpa.springjpademo.model.Customer;
import com.springjpa.springjpademo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Customer saved";
    }

    @GetMapping("/getCustProdList")
    public List getCustProdList(){
        return customerRepository.getCustProdList();
    }


}
