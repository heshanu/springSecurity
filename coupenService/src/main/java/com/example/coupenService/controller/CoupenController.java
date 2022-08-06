package com.example.coupenService.controller;

import com.example.coupenService.model.Coupen;
import com.example.coupenService.repository.CoupenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupenapi")
public class CoupenController {

    @Autowired
    private CoupenRepo coupenRepo;

    @PostMapping("/coupens")
    public Coupen create(@RequestBody Coupen coupen) {
        return coupenRepo.save(coupen);
    }

    @GetMapping("/coupens/{code}")
    public Coupen getCoupen(String code) {
        return coupenRepo.findByCode(code);
    }

    @GetMapping("/coupens")
    public List<Coupen> getCoupen() {
         return coupenRepo.findAll();
    }

}
