package com.example.hacathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hacathon.model.Orders;
import com.example.hacathon.service.OrdersService;

@RestController
 @RequestMapping("/orders")
public class OrdersController {
    @Autowired OrdersService ordersService;
   
   
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/good")
    public double totalOrderSales(){
        return ordersService.calculateTotalSales();
    }
    @GetMapping
    public List<Orders> getAllOrders(){
        return ordersService.getAllMethods();
    }
    
   

  
   

    
}
