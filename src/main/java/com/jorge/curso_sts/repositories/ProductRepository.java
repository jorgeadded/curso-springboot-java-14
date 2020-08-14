package com.jorge.curso_sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorge.curso_sts.entities.Category;
import com.jorge.curso_sts.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}