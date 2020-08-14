package com.jorge.curso_sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorge.curso_sts.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}