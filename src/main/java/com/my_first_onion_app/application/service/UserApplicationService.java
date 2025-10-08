package com.my_first_onion_app.application.service;

import com.my_first_onion_app.domain.entity.User;
import com.my_first_onion_app.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserApplicationService {

  private final UserService userService;

  public UserApplicationService(UserService userService) {
    this.userService = userService;
  }

  public Optional<User> findByUsername(String username) {
    return userService.findByUsername(username);
  }

  public User save(User user) {
    return userService.save(user);
  }
}
