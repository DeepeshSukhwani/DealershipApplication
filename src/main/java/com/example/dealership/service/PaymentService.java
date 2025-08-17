package com.example.dealership.service;

import com.example.dealership.model.Payment;
import com.example.dealership.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public Payment initiatePayment(Long dealerId, double amount, String method) {
        Payment payment = new Payment();
        payment.setDealerId(dealerId);
        payment.setAmount(amount);
        payment.setPaymentMethod(method);
        payment.setPaymentStatus("PENDING");
        payment.setCreatedAt(new Date());
        paymentRepository.save(payment);

        // Simulate callback after 5 seconds
        simulatePaymentSuccess(payment);
        return payment;
    }

    @Async
    public void simulatePaymentSuccess(Payment payment) {
        try {
            Thread.sleep(5000); // Simulate delay
            payment.setPaymentStatus("SUCCESS");
            paymentRepository.save(payment);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
