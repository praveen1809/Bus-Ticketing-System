package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.Passenger;

import java.util.List;

public interface PassengerService {
    public Passenger addPassenger(Passenger passenger);

    public List<Passenger> getAllPassengersList();

    public Passenger getPassengerById(int passengerId);
    
    public Passenger updatePassenger(int passengerId, Passenger passenger);

    public void deletePassengerById(int passengerId);
}
