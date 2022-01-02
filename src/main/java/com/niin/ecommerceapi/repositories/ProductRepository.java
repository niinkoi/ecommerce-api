package com.niin.ecommerceapi.repositories;

import com.niin.ecommerceapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}