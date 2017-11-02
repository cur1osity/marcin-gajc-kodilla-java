package com.kodilla.good.patterns.challenge1;

import lombok.Value;

@Value
public class OrderRequest {

    private Product product;
    private int quantity;
    private Shop shop;

}
