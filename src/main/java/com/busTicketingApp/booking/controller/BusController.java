package com.busTicketingApp.booking.controller;

import com.busTicketingApp.booking.entity.Bus;
import com.busTicketingApp.booking.entity.BusOperator;
import com.busTicketingApp.booking.entity.Route;
import com.busTicketingApp.booking.service.BusOperatorService;
import com.busTicketingApp.booking.service.BusService;
import com.busTicketingApp.booking.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusController {


    @Autowired
    private BusService busService;

    @Autowired
    private BusOperatorService busOperatorService;

    @Autowired
    private RouteService routeService;

    @PostMapping("/bus")
    public Bus addBus(@RequestBody Bus bus){
/*
        System.out.println("busOperatorId: "+bus.getBusOperator().getOperatorId()+" routeId:" +
                bus.getRoute().getRouteId());

        BusOperator busOperator = busOperatorService.fetchBusOperatorById(
                bus.getBusOperator().getOperatorId());

        bus.setBusOperator(busOperator);

        Route route = routeService.fetchRouteById(bus.getRoute().getRouteId());
        bus.setRoute(route);
*/
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
