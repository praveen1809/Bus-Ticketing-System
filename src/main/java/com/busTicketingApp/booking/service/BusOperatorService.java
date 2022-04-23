package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.BusOperator;

import java.util.List;

public interface BusOperatorService {
    public BusOperator addBusOperator(BusOperator busOperator);

    public List<BusOperator> fetchBusOperatorList();

    public BusOperator fetchBusOperatorById(int busOperatorId);

    public void deleteBusOperatorById(int busOperatorId);
}
