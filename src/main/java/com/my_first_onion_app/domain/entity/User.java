package com.my_first_onion_app.domain.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class User {

  private UUID id;
  private String username;
  private String password;
}
