package com.example.dealership.controller;

import com.example.dealership.model.Vehicle;
import com.example.dealership.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.createVehicle(vehicle);
    }

    @GetMapping("/premium")
    public List<Vehicle> getVehiclesByPremiumDealers() {
        return vehicleService.getVehiclesByPremiumDealers();
    }

    // Other CRUD endpoints...
}
