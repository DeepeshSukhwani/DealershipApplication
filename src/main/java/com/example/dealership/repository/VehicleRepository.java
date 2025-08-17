package com.example.dealership.repository;

import com.example.dealership.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query("SELECT v FROM Vehicle v WHERE v.dealer.subscriptionType = 'PREMIUM'")
    List<Vehicle> findVehiclesByPremiumDealers();
}
