package com.my_first_onion_app.infrastructure.persistence;

import com.my_first_onion_app.domain.entity.User;
import com.my_first_onion_app.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaUserRepository implements UserRepository {

  @Override
  public Optional<User> findByUsername(String username) {
    return Optional.empty();
  }

  @Override
  public User save(User user) {
    return null;
  }
}
