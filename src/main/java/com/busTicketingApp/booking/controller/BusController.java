package com.busTicketingApp.booking.controller;

import com.busTicketingApp.booking.entity.Bus;
import com.busTicketingApp.booking.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
