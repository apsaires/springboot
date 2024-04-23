package com.noremp.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noremp.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}