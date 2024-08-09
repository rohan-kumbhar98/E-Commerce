package com.ecom.spring_ecomm_jpa.repository;

import com.ecom.spring_ecomm_jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByProductName(String firstName);

    List<Product> findByProductCode(String productCode);
}
