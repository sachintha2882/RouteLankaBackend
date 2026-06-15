package com.example.RouteLanka.Controller;


import com.example.RouteLanka.DTO.AuthRequest;
import com.example.RouteLanka.Service.AuthSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthSerivice authSerivice;

    @PostMapping("/register")
    public String register(@RequestBody AuthRequest request){
        return authSerivice.register(request);
    }
}
