package com.example.TrelloClone.repository;

import com.example.TrelloClone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    List<User> findByUsernameContaining(String username);
    List<User> findByEmailContaining(String email);
}
