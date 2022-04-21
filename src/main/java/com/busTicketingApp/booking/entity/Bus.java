package com.busTicketingApp.booking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int busNumber;
    private String serviceName;
    private int totalSeats;
    private String source;
    private String destination;
    private List<Seat> seats;

    public Bus(String serviceName, int totalSeats, String source, String destination) {
        this.serviceName = serviceName;
        this.totalSeats = totalSeats;
        this.source = source;
        this.destination = destination;
        seats = new ArrayList<Seat>();
    }
}
