package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.BusOperator;
import com.busTicketingApp.booking.repository.BusOperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusOperatorServiceImpl implements BusOperatorService{

    @Autowired
    private BusOperatorRepository busOperatorRepository;

    @Override
    public BusOperator addBusOperator(BusOperator busOperator) {
        return busOperatorRepository.save(busOperator);
    }

    @Override
    public List<BusOperator> fetchBusOperatorList() {
        return busOperatorRepository.findAll();
    }

    @Override
    public BusOperator fetchBusOperatorById(int busOperatorId) {
        return busOperatorRepository.findById(busOperatorId).get();
    }

    @Override
    public void deleteBusOperatorById(int busOperatorId) {
        busOperatorRepository.deleteById(busOperatorId);
    }
}
