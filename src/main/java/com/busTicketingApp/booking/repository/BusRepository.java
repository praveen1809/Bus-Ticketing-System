package com.busTicketingApp.booking.repository;

import com.busTicketingApp.booking.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus,Integer> {

}
