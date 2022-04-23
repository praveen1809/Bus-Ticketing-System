package com.busTicketingApp.booking.repository;

import com.busTicketingApp.booking.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BusRepository extends JpaRepository<Bus,Integer> {
    /*
    public Bus findByServiceName(String serviceName);
    public Bus findByServiceNameIgnoreCase(String serviceName);
    public List<Bus> findBySourceAndDestination(String source, String destination);


    @Query(value = "SELECT * FROM busticketing.bus b where b.source= :source And b.destination=:destination",
            nativeQuery = true)
    public List<Bus> findBySourceAndDestination(String source, String destination);
     */

}
