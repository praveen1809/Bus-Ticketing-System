package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.Route;
import com.busTicketingApp.booking.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService{

    @Autowired
    private RouteRepository routeRepository;

    @Override
    public Route addRoute(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public List<Route> fetchRouteList() {
        return routeRepository.findAll();
    }

    @Override
    public Route fetchRouteById(int routeId) {
        return routeRepository.findById(routeId).get();
    }

    @Override
    public void deleteRouteById(int routeId) {
        routeRepository.deleteById(routeId);
    }
}
