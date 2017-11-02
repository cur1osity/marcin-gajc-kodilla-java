package com.kodilla.good.patterns.challenge1;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Product product = new Product("eggs");

        Shop shop = new ExtraFoodShop();

        return new OrderRequest(product, 10, shop);

    }
}
