package com.kodilla.good.patterns.challenge1;

public class HealthyShop implements Shop {

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Ordering " + orderRequest.getQuantity() + " "
                + orderRequest.getProduct().getName() + " in HealthyShop");

        return true;
    }
}
