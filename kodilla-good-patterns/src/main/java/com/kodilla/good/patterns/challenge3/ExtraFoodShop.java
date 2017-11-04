package com.kodilla.good.patterns.challenge3;

public class ExtraFoodShop implements Shop {

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Ordering " + orderRequest.getQuantity() + " "
                + orderRequest.getProduct().getName() + " in ExtraFoodShop");

        return true;
    }
}
