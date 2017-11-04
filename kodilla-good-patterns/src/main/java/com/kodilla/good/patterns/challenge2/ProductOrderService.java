package com.kodilla.good.patterns.challenge2;

import lombok.Value;

@Value
public class ProductOrderService implements OrderService {


    @Override
    public boolean order(OrderRequest orderRequest) {

        System.out.println("Ordering " + orderRequest.getProduct().getQuantity() +
                " " + orderRequest.getProduct().getName() + "/es for "
                + orderRequest.getUser().getName());
        System.out.println("Date of order: " + orderRequest.getOrderDate());

        return orderRequest.isCorrect();
    }
}
