package com.example.phoneshop.controller;

import java.util.List;

import com.example.phoneshop.model.BuyOrder;
import com.example.phoneshop.service.BuyOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BuyOrderController {

    @Autowired
    private BuyOrderService buyOrderService;

    @GetMapping(path = "/buyOrder")
    public List<BuyOrder> getOrders() {
        return buyOrderService.getAllBuyOrders();
    }

    @GetMapping(path = "/buyOrder")
    public BuyOrder getOrder(@RequestBody Long someOrder) {
        return buyOrderService.getOrder(someOrder);
    }

    @PostMapping(path = "/buyOrder")
    public void createOrder(@RequestBody BuyOrder someOrder) {
        buyOrderService.createBuyOrder(someOrder);
    }

}