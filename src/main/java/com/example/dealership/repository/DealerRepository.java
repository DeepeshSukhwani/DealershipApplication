package com.example.dealership.repository;

import com.example.dealership.model.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealerRepository extends JpaRepository<Dealer, Long> {
    Dealer findByEmail(String email);
}
