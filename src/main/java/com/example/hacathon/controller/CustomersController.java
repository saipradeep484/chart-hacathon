package com.example.hacathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hacathon.model.Customers;
import com.example.hacathon.service.CustomersService;

@RestController
@RequestMapping("/customers")
public class CustomersController {
    @Autowired public CustomersService customersService;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public java.util.List<Customers> getAllCustomers() {
        return customersService.getAllCustomers();
    }
}
