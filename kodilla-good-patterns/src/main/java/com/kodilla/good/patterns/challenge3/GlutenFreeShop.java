package com.kodilla.good.patterns.challenge3;

public class GlutenFreeShop implements Shop {

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("Ordering " + orderRequest.getQuantity() + " "
                + orderRequest.getProduct().getName() + " in GlutenFreeShop");

        return true;
    }
}
