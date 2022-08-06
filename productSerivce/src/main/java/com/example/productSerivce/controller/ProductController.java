package com.example.productSerivce.controller;

import com.example.productSerivce.dto.Coupen;
import com.example.productSerivce.model.Product;
import com.example.productSerivce.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/productapi")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private RestTemplate restTemplate;
/*
    @Value("${coupenService.url}")
    private String coupenServiceUrl;
*/

    @PostMapping("/products")
    public Product create(@RequestBody Product product) {
        Coupen coupens = restTemplate.getForObject("http://localhost:9091/coupenapi/coupens/" + product.getCoupenCode(), Coupen.class);
        //product.setPrice(product.getPrice().subtract(coupen.getDiscoint()));
        System.out.println(coupens);
        product.setPrice(product.getPrice().subtract(coupens.getDiscoint())) ;
        System.out.println(product.getPrice());
        return productRepo.save(product);
    }
    
    @GetMapping("/hello")
    public String hello() {
        return "hi";
    }
}
