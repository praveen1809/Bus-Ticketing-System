package com.busTicketingApp.booking.controller;

import com.busTicketingApp.booking.entity.Passenger;
import com.busTicketingApp.booking.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/passenger")
    public Passenger addPassenger(Passenger passenger){
        return passengerService.addPassenger(passenger);
    }

    @GetMapping("/passenger")
    public List<Passenger> getAllPassengersList(){
        return passengerService.getAllPassengersList();
    }

    @GetMapping("/passenger/{id}")
    public Passenger getPassengerById(@PathVariable("id") int passengerId){
        return passengerService.getPassengerById(passengerId);
    }

    @PutMapping("/passenger/{id}")
    public Passenger updatePassenger(@PathVariable("id") int passengerId,@RequestBody Passenger passenger){
        return passengerService.updatePassenger(passengerId,passenger);
    }

    @DeleteMapping("/passenger/{id}")
    public String deletePassengerById(@PathVariable("id") int passengerId){
        passengerService.deletePassengerById(passengerId);
        return "Passenger details deleted successfully";

    }
}
