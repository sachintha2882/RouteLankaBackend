package com.example.RouteLanka.Service;

import com.example.RouteLanka.DTO.BusDTO;
import com.example.RouteLanka.Model.Bus;
import com.example.RouteLanka.Repository.BusRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private ModelMapper modelMapper;

    public BusDTO saveBus(BusDTO busDTO){

        Bus bus = modelMapper.map(busDTO, Bus.class);

        Bus savedBus = busRepository.save(bus);

        String busRef = "RL-" + String.format("%03d", savedBus.getId());

        savedBus.setBusRefNumber(busRef);

        Bus finalBus = busRepository.save(savedBus);

        return modelMapper.map(savedBus, BusDTO.class);
    }

    public List<BusDTO> getAllBuses(){

        return busRepository.findAll()
                .stream()
                .map(bus -> modelMapper.map(bus, BusDTO.class))
                .collect(Collectors.toList());
    }

    public BusDTO getBusById(Long id){

        Bus bus = busRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bus not found"));

        return modelMapper.map(bus, BusDTO.class);
    }

    public BusDTO updateBus(Long id, BusDTO busDTO){

        Bus bus = busRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bus not found"));

        bus.setRoute(busDTO.getRoute());
        bus.setBusRegistrationNo(busDTO.getBusRegistrationNo());
        bus.setDriver(String.valueOf(busDTO.getDriver()));
        bus.setConductor(busDTO.getConductor());
        bus.setFuelAllocation(busDTO.getFuelAllocation());
        bus.setDailyIncome(busDTO.getDailyIncome());

        Bus updatedBus = busRepository.save(bus);

        return modelMapper.map(updatedBus, BusDTO.class);
    }

    public void deleteBus(Long id){

        busRepository.deleteById(id);
    }
}