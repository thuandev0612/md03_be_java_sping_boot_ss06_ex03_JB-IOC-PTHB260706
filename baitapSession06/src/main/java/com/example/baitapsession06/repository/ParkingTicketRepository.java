package com.example.baitapsession06.repository;

import com.example.baitapsession06.model.ParkingTicket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParkingTicketRepository extends JpaRepository<ParkingTicket, Long> {
    boolean existsByVehicleIdAndCheckOutTimeIsNull(Long vehicleId);

    Optional<ParkingTicket> findFirstByVehicleIdAndCheckOutTimeIsNullOrderByCheckInTimeDescIdDesc(Long vehicleId);
}
