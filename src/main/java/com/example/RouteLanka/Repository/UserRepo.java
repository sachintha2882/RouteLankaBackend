package com.example.RouteLanka.Repository;

import com.example.RouteLanka.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo  extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);
}
