package com.noremp.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noremp.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}