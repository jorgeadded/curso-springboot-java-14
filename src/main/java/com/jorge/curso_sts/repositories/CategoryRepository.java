package com.jorge.curso_sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorge.curso_sts.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}