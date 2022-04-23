package com.busTicketingApp.booking.controller;

import com.busTicketingApp.booking.entity.Route;
import com.busTicketingApp.booking.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RouteController {

    @Autowired
    private RouteService routeService;

    @PostMapping("/route")
    public Route addRoute(@RequestBody Route route){
        return routeService.addRoute(route);
    }

    @GetMapping("/route")
    public List<Route> fetchBusList(){
        return routeService.fetchRouteList();
    }

    @GetMapping("/route/{id}")
    public Route fetchRouteById(@PathVariable("id") int routeId){
        return routeService.fetchRouteById(routeId);
    }

    @DeleteMapping("/route/{id}")
    public String deleteRouteById(@PathVariable("id") int routeId){
        routeService.deleteRouteById(routeId);
        return "Bus information deleted successfully";
    }
}
