package com.example.RouteLanka.Controller;

import com.example.RouteLanka.DTO.BusDTO;
import com.example.RouteLanka.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buses")
@CrossOrigin(origins = "http://localhost:5173")
public class BusController {

    @Autowired
    private BusService busService;

    // Add Bus
    @PostMapping
    public BusDTO addBus(@RequestBody BusDTO busDTO){
        return busService.saveBus(busDTO);
    }

    // View All Buses
    @GetMapping("/getallusers")
    public List<BusDTO> getAllBuses(){
        return busService.getAllBuses();
    }

    // View Bus By ID
    @GetMapping("/viewbuses/{id}")
    public BusDTO getBusById(@PathVariable Long id){
        return busService.getBusById(id);
    }

    // Update Bus
    @PutMapping("/updatebus/{id}")
    public BusDTO updateBus(@PathVariable Long id,
                            @RequestBody BusDTO busDTO){

        return busService.updateBus(id, busDTO);
    }

    // Delete Bus
    @DeleteMapping("/deletebus/{id}")
    public String deleteBus(@PathVariable Long id){

        busService.deleteBus(id);

        return "Bus Deleted Successfully";
    }
}