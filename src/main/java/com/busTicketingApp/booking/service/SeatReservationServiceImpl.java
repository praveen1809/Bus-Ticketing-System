package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.SeatReservation;
import com.busTicketingApp.booking.repository.SeatReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatReservationServiceImpl implements SeatReservationService{

    @Autowired
    private SeatReservationRepository seatReservationRepository;

    @Override
    public SeatReservation bookSeat(SeatReservation seatReservation) {
        return seatReservationRepository.save(seatReservation);
    }

    @Override
    public List<SeatReservation> getAllSeatReservations() {
        return seatReservationRepository.findAll();
    }

    @Override
    public SeatReservation getSeatReservationById(int seatReservationId) {
        return seatReservationRepository.findById(seatReservationId).get();
    }

    @Override
    public void deleteSeatReservationById(int seatReservationId) {
        seatReservationRepository.deleteById(seatReservationId);
    }
}
