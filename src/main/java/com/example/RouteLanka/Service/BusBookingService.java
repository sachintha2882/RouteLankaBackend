package com.example.RouteLanka.Service;

import com.example.RouteLanka.DTO.BusBookingDTO;
import com.example.RouteLanka.Model.Bus;
import com.example.RouteLanka.Model.BusBooking;
import com.example.RouteLanka.Repository.BusBookingRepo;
import com.example.RouteLanka.Repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class BusBookingService {

    @Autowired
    private BusBookingRepo busBookingRepo;

    @Autowired
    private BusRepository busRepository;

    public BusBookingDTO saveBooking(BusBookingDTO dto){

        Bus bus = busRepository.findById(dto.getBusId())
                .orElseThrow(() -> new RuntimeException("Bus not found"));

        BusBooking booking = new BusBooking();

        booking.setPassengerName(dto.getPassengerName());
        booking.setTravelDate(dto.getTravelDate());
        booking.setSeatNumber(dto.getSeatNumber());
        booking.setStatus("BOOKED");
        booking.setBus(bus);

        BusBooking saved = busBookingRepo.save(booking);

        dto.setId(saved.getId());
        dto.setStatus(saved.getStatus());

        return dto;
    }

    public List<BusBooking> getAllBookings(){
        return busBookingRepo.findAll();
    }
}
