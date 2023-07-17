package com.dev.desafio1.services;

import com.dev.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public Double shipment(Order order) {
        Double basic = order.getBasic();
        Double valorComDesconto = basic - caculaDesconto(order);
        return valorComDesconto+calculaFrete(order);

    }

    private Double calculaFrete(Order order) {
        if(order.getBasic()<100)
            return  20.0d;
        if(order.getBasic()>=100 & order.getBasic()<=200)
            return 12.0d;
        return 0.0d;
    }

    private Double caculaDesconto(Order order) {
        Double porcentagemDesconto = order.getDiscount();
        Double basic = order.getBasic();
        if(porcentagemDesconto>0){
            return (basic*porcentagemDesconto)/100;
        }
        return 0.0;
    }
}
