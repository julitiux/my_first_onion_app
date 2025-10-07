package com.my_first_onion_app.infrastructure.web;

import com.my_first_onion_app.application.service.UserApplicationService;
import com.my_first_onion_app.domain.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserApplicationService userApplicationService;

  public UserController(UserApplicationService userApplicationService) {
    this.userApplicationService = userApplicationService;
  }

  @GetMapping("/username")
  public User getUserByUsername(String username) {
    return userApplicationService.findByUsername(username)
      .orElse(null);
  }
}
