package com.kodilla.good.patterns.challenge2;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class ProductRepository implements OrderRepository {

    private List<OrderRequest> orders = new ArrayList<>();

    @Override
    public void createOrder(OrderRequest orderRequest) {

        orders.add(orderRequest);

        System.out.println("Order was added to orders list");

    }
}
