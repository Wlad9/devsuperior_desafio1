package com.dev.desafio1.services;

import com.dev.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;
    public Double total(Order order){
        return shippingService.shipment(order);
    }
}
