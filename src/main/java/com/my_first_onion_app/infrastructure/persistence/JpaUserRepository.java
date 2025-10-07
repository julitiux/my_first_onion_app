package com.my_first_onion_app.infrastructure.persistence;

import com.my_first_onion_app.domain.entity.User;
import com.my_first_onion_app.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaUserRepository implements UserRepository {

  private final SpringDataUserRepository repository;

  public JpaUserRepository(SpringDataUserRepository repository) {
    this.repository = repository;
  }

  @Override
  public Optional<User> findByUsername(String username) {
    return repository.findByUsername(username);
  }

  @Override
  public User save(User user) {
    return repository.save(user);
  }
}
