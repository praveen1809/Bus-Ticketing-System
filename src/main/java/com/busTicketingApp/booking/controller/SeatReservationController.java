package com.busTicketingApp.booking.controller;

import com.busTicketingApp.booking.entity.SeatReservation;
import com.busTicketingApp.booking.service.SeatReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeatReservationController {

    @Autowired
    private SeatReservationService seatReservationService;

    @PostMapping("/seat")
    public SeatReservation bookSeat(@RequestBody SeatReservation seatReservation){
        return seatReservationService.bookSeat(seatReservation);
    }

    @GetMapping("/seat")
    public List<SeatReservation> getAllSeatReservations(){
        return seatReservationService.getAllSeatReservations();
    }

    @GetMapping("/seat/{id}")
    public SeatReservation getSeatReservationById(@PathVariable("id") int seatReservationId){
        return seatReservationService.getSeatReservationById(seatReservationId);
    }

    @DeleteMapping("/seat/{id}")
    public String deleteSeatReservationById(@PathVariable("id") int seatReservationId){
        seatReservationService.deleteSeatReservationById(seatReservationId);
        return "Seat Reservation successfully cancelled";
    }
}
