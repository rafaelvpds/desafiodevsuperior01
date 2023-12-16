package com.desafiodevsuperior.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiodevsuperior.desafio.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shipService;

    public double total(Order order) {
        return (order.getBasic() - (order.getBasic() * order.getDiscount() / 100)) + shipService.shipment(order);

    }

}
