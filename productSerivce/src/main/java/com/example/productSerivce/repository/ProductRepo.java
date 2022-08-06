package com.example.productSerivce.repository;

import com.example.productSerivce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long>  {
}
