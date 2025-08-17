package com.example.dealership.controller;

import com.example.dealership.model.Dealer;
import com.example.dealership.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dealers")
public class DealerController {
    @Autowired
    private DealerService dealerService;

    @GetMapping
    public List<Dealer> getAllDealers() {
        return dealerService.getAllDealers();
    }

    @PostMapping
    public Dealer createDealer(@RequestBody Dealer dealer) {
        return dealerService.createDealer(dealer);
    }

    // Other CRUD endpoints...
}
