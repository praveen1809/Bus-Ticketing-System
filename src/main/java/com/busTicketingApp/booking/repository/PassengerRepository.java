package com.busTicketingApp.booking.repository;

import com.busTicketingApp.booking.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
}
