package com.desafio_santander.apirestfull.santanderdesafio.service;

import com.desafio_santander.apirestfull.santanderdesafio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}