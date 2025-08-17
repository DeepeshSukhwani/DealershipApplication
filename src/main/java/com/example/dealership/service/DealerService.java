package com.example.dealership.service;

import com.example.dealership.model.Dealer;
import com.example.dealership.repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealerService {
    @Autowired
    private DealerRepository dealerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Dealer> getAllDealers() {
        return dealerRepository.findAll();
    }

    public Dealer createDealer(Dealer dealer) {
        // Encode the password before saving
        dealer.setPassword(passwordEncoder.encode(dealer.getPassword()));
        return dealerRepository.save(dealer);
    }



    // Other CRUD methods...
}
