package com.my_first_onion_app.infrastructure.persistence;

import com.my_first_onion_app.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SpringDataUserRepository extends JpaRepository<User, UUID> {

  Optional<User> findByUsername(String username);

}
