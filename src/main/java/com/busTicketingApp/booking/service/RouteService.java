package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.Route;

import java.util.List;

public interface RouteService {
    public Route addRoute(Route route);

    public List<Route> fetchRouteList();

    public Route fetchRouteById(int routeId);

    public void deleteRouteById(int routeId);
}
