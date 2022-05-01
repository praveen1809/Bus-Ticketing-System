package com.busTicketingApp.booking.service;

import com.busTicketingApp.booking.entity.Passenger;
import com.busTicketingApp.booking.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PassengerServiceImpl implements PassengerService{

    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public List<Passenger> getAllPassengersList() {
        return passengerRepository.findAll();
    }

    @Override
    public Passenger getPassengerById(int passengerId) {
        return passengerRepository.findById(passengerId).get();
    }

    @Override
    public Passenger updatePassenger(int passengerId, Passenger passenger) {

        Passenger passengerDB  = passengerRepository.findById(passengerId).get();

        if(Objects.nonNull(passenger.getName()) &&
        !"".equalsIgnoreCase(passenger.getName())){
            passengerDB.setName(passenger.getName());
        }

        if(Objects.nonNull(passenger.getMobileNumber()) &&
                !"".equalsIgnoreCase(passenger.getMobileNumber())){
            passengerDB.setMobileNumber(passenger.getMobileNumber());
        }

        if(Objects.nonNull(passenger.getAddress()) &&
                !"".equalsIgnoreCase(passenger.getAddress())){
            passengerDB.setAddress(passenger.getAddress());
        }

        if(Objects.nonNull(passenger.getUserName()) &&
                !"".equalsIgnoreCase(passenger.getUserName())){
            passengerDB.setUserName(passenger.getUserName());
        }

        if(Objects.nonNull(passenger.getPassword()) &&
                !"".equalsIgnoreCase(passenger.getPassword())){
            passengerDB.setPassword(passenger.getPassword());
        }
        return passengerRepository.save(passengerDB);
    }

    @Override
    public void deletePassengerById(int passengerId) {
        passengerRepository.deleteById(passengerId);
    }

}
