package com.example.RouteLanka.Model;

import com.example.RouteLanka.Model.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;
    private String email;
    private String Password;

    @Enumerated(EnumType.STRING)
    private Role role;
}

