package com.example.hacathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hacathon.model.Products;
import com.example.hacathon.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired public ProductsService productsService;
     @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
     public List<Products> getAllProducts()
    {
        return productsService.getAllProducts();
    }
}
