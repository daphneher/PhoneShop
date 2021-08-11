package com.example.phoneshop.repository;



import com.example.phoneshop.model.BuyOrder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyOrderRepository extends JpaRepository<BuyOrder, Long> {
}