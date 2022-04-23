package com.busTicketingApp.booking.repository;

import com.busTicketingApp.booking.entity.BusOperator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusOperatorRepository extends JpaRepository<BusOperator,Integer> {
}
