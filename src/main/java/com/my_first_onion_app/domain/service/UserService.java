package com.my_first_onion_app.domain.service;

import com.my_first_onion_app.domain.entity.User;
import com.my_first_onion_app.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Optional<User> findByUsername(String username) {
    return userRepository.findByUsername(username);
  }

  public User save(User user) {
    return userRepository.save(user);
  }

}
