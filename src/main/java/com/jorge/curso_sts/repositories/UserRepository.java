package com.jorge.curso_sts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorge.curso_sts.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}