package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.Bus;
import com.busTicketingApp.booking.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BusServiceImpl implements BusService{


    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> fetchBusList() {
        return busRepository.findAll();
    }

    @Override
    public Bus fetchBusById(int busId) {
        return busRepository.findById(busId).get();
    }

    @Override
    public void deleteBusById(int busId) {
        busRepository.deleteById(busId);
    }



}
