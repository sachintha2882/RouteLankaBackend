package com.example.RouteLanka.Controller;

import com.example.RouteLanka.DTO.BusBookingDTO;
import com.example.RouteLanka.Model.BusBooking;
import com.example.RouteLanka.Service.BusBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin
public class BusBookingController {

    @Autowired
    private BusBookingService bookingService;

    // Create Booking
    @PostMapping("/bookseat")
    public BusBookingDTO createBooking(@RequestBody BusBookingDTO dto) {
        return bookingService.saveBooking(dto);
    }

    // Get All Bookings
    @GetMapping("/viewbooking")
    public List<BusBooking> getAllBookings() {
        return bookingService.getAllBookings();
    }
}