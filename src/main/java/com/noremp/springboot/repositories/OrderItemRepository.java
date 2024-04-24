package com.noremp.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noremp.springboot.entities.OrderItem;
import com.noremp.springboot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
