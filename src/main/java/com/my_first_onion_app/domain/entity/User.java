package com.my_first_onion_app.domain.entity;

import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
public class User {

  private UUID id;
  private String username;
  private String password;
  private Date dataCreated;

}
