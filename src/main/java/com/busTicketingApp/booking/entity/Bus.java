package com.busTicketingApp.booking.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int busNumber;
/*
    @JsonIgnore
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "operator_id",
            referencedColumnName = "operatorId"
    )
    private BusOperator busOperator;
 */
    private int busOperatorId;
    private int totalSeats;

/*
    @JsonIgnore
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "route_id",
            referencedColumnName = "routeId"
    )
    private Route route;
 */
    private int routeId;
    private String departureTime;
    private String arrivalTime;

}

