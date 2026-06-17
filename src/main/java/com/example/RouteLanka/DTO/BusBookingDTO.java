package com.example.RouteLanka.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BusBookingDTO {

    private  Long id;

    private String passengerName;

    private String travelDate;

    private int seatNumber;

    private String status;

    private Long busId;


}
