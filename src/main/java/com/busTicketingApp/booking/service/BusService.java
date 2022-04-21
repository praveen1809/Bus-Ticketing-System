package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.Bus;

import java.util.List;

public interface BusService {
    Bus addBus(Bus bus);

    List<Bus> fetchBusList();
}
