package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.Bus;

import java.util.List;

public interface BusService {

    public Bus addBus(Bus bus);

    public List<Bus> fetchBusList();

    public Bus fetchBusById(int busId);

    public void deleteBusById(int busId);

}
