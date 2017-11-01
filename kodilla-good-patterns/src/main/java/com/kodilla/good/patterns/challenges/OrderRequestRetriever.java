package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Marcin Gajc", "marcin.gajc@gmail.com");

        LocalDateTime orderDate = LocalDateTime.of(2017,9,1,12,00);

        Product product = new Product("toothbrush",10);

        return new OrderRequest(user, product, orderDate);

    }
}
