package com.desafio_santander.apirestfull.santanderdesafio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio_santander.apirestfull.santanderdesafio.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
