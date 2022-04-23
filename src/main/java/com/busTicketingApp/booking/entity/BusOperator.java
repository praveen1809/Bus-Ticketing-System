package com.busTicketingApp.booking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusOperator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int operatorId;
    private int operatorName;
    private int totalBuses;
    private String username;
    private String password;
}
