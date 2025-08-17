package com.example.dealership.service;

import com.example.dealership.model.Vehicle;
import com.example.dealership.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getVehiclesByPremiumDealers() {
        return vehicleRepository.findVehiclesByPremiumDealers();
    }

    // Other CRUD methods...
}
