package com.example.coupenService.repository;

import com.example.coupenService.model.Coupen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoupenRepo extends JpaRepository<Coupen,Long> {
    Coupen findByCode(String code);
}
