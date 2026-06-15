package com.example.RouteLanka.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusOwnerDTO {

    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;

}


