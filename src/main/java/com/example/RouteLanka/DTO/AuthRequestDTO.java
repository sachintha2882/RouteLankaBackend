package com.example.RouteLanka.DTO;

import lombok.Data;

@Data
public class AuthRequestDTO {

    private String Name;
    private String Email;
    private String Password;
    private String confirmPassword;
    private String Role;

}
