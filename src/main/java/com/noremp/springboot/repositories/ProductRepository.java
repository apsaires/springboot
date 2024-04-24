package com.noremp.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noremp.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}