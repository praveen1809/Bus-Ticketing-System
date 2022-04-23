package com.busTicketingApp.booking.controller;

import com.busTicketingApp.booking.entity.Bus;
import com.busTicketingApp.booking.entity.BusOperator;
import com.busTicketingApp.booking.service.BusOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusOperatorController {

    @Autowired
    private BusOperatorService busOperatorService;

    @PostMapping("/busOperator")
    public BusOperator addBusOperator(@RequestBody BusOperator busOperator){
        return busOperatorService.addBusOperator(busOperator);
    }

    @GetMapping("/busOperator")
    public List<BusOperator> fetchBusOperatorList(){
        return busOperatorService.fetchBusOperatorList();
    }

    @GetMapping("/busOperator/{id}")
    public BusOperator fetchBusOperatorById(@PathVariable("id") int busOperatorId){
        return busOperatorService.fetchBusOperatorById(busOperatorId);
    }

    @DeleteMapping("/busOperator/{id}")
    public String deleteBusOperatorById(@PathVariable("id") int busOperatorId){
        busOperatorService.deleteBusOperatorById(busOperatorId);
        return "Bus information deleted successfully";
    }
}
