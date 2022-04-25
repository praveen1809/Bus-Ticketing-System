package com.busTicketingApp.booking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusOperator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int operatorId;

    private String operatorName;
    private int totalBuses;
    private String username;
    private String password;
}
