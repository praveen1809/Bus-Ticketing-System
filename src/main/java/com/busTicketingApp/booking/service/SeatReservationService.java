package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.SeatReservation;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SeatReservationService {
    public SeatReservation bookSeat(SeatReservation seatReservation);

    public List<SeatReservation> getAllSeatReservations();

    public SeatReservation getSeatReservationById(int seatReservationId);

    public void deleteSeatReservationById(int seatReservationId);
}
