package com.busTicketingApp.booking.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int busNumber;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "operator_id",
            referencedColumnName = "operatorId"
    )
    private BusOperator busOperator;
    private int totalSeats;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "route_id",
            referencedColumnName = "routeId"
    )
    private Route route;
    private String departureTime;
    private String arrivalTime;

}

