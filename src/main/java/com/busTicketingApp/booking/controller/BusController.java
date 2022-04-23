package com.busTicketingApp.booking.controller;

import com.busTicketingApp.booking.entity.Bus;
import com.busTicketingApp.booking.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusController {


    @Autowired
    private BusService busService;

    @PostMapping("/bus")
    public Bus addBus(@RequestBody Bus bus){
        return busService.addBus(bus);
    }

    @GetMapping("/bus")
    public List<Bus> fetchBusList(){
        return busService.fetchBusList();
    }

    @GetMapping("/bus/{id}")
    public Bus fetchBusById(@PathVariable("id") int busId){
        return busService.fetchBusById(busId);
    }

    @DeleteMapping("/bus/{id}")
    public String deleteBusById(@PathVariable("id") int busId){
        busService.deleteBusById(busId);
        return "Bus information deleted successfully";
    }


}
