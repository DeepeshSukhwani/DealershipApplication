package com.example.dealership.controller;

import com.example.dealership.model.Payment;
import com.example.dealership.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PreAuthorize("hasRole('DEALER')")
    @PostMapping("/initiate")
    public Payment initiatePayment(@RequestParam Long dealerId, @RequestParam double amount, @RequestParam String method) {
        return paymentService.initiatePayment(dealerId, amount, method);
    }
}
