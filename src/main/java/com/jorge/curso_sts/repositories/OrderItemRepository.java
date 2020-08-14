package com.jorge.curso_sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorge.curso_sts.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}