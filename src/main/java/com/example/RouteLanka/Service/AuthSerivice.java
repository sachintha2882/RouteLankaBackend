package com.example.RouteLanka.Service;


import com.example.RouteLanka.DTO.AuthRequest;
import com.example.RouteLanka.DTO.LoginRequest;
import com.example.RouteLanka.Model.Role;
import com.example.RouteLanka.Model.User;
import com.example.RouteLanka.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthSerivice {

    @Autowired
    private UserRepo userRepo;


    public String register(AuthRequest req) {

        User user = new User();
        user.setName(req.getName());
        user.setEmail(req.getEmail());
        user.setPassword(req.getPassword());

        user.setRole(Role.valueOf(req.getRole() ));

        userRepo.save(user);

        return "User Register successfully";

    }


    public String login(LoginRequest req) {

        Optional<User> user = userRepo.findByEmail(req.getEmail());

        if (user.isPresent()) {
            if (user.get().getPassword().equals(req.getPassword())) {
                return "Login success as " + user.get().getRole();
            }
        }

        return "Invalid email or password";


    }
}
