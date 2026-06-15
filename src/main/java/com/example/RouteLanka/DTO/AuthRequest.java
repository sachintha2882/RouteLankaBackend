package com.example.RouteLanka.DTO;

import lombok.Data;

@Data
public class AuthRequest {

    private String Name;
    private String Email;
    private String Password;
    private String Role;

}
