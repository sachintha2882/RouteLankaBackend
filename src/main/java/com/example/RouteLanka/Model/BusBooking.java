package com.example.RouteLanka.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BusBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String travelDate;
    private int seatNumber;
    private String status;

    @ManyToOne
    @JoinColumn(name="bus_id")
    private Bus bus;
}
