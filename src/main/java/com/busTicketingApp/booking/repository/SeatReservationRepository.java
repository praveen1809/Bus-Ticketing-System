package com.busTicketingApp.booking.repository;

import com.busTicketingApp.booking.entity.SeatReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatReservationRepository extends JpaRepository<SeatReservation,Integer> {
}
