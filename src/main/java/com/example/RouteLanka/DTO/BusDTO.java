package com.example.RouteLanka.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BusDTO {

    private Long id;

    private String busRefNumber;
    private String route;
    private String busRegistrationNo;
    private String driver;
    private String conductor;
    private double fuelAllocation;
    private double dailyIncome;
}
