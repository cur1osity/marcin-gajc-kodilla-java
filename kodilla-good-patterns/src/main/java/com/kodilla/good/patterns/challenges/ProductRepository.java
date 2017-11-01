package com.kodilla.good.patterns.challenges;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class ProductRepository implements OrderRepository {

    private List<OrderRequest> orders = new ArrayList<>();

    @Override
    public void createOrder(OrderRequest orderRequest) {

        orders.add(orderRequest);

//        for (OrderRequest order : orders) {
//
//            System.out.println(order);
//        }

        System.out.println("Order was added to orders list");

    }
}
