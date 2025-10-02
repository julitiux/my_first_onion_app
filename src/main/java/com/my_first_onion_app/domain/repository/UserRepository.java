package com.my_first_onion_app.domain.repository;

import com.my_first_onion_app.domain.entity.User;

import java.util.Optional;

public interface UserRepository {

  Optional<User> findByUsername(final String username);

}
