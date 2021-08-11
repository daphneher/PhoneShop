package com.example.phoneshop.service;

import java.util.List;

import com.example.phoneshop.model.BuyOrder;
import com.example.phoneshop.repository.BuyOrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyOrderService {

    @Autowired
    private BuyOrderRepository buyOrderRepository;

    public List<BuyOrder> getAllBuyOrders() {
        return buyOrderRepository.findAll();
    }
    
    public BuyOrder getOrder(Long someBuyOrder) {
        return buyOrderRepository.getById(someBuyOrder);
    }

    public void createBuyOrder(BuyOrder someBuyOrder) {
        buyOrderRepository.save(someBuyOrder);
    }
}
