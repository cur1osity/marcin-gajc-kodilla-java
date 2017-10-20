package com.kodilla.stream.invoice.simple;

import lombok.Value;

@Value
public final class SimpleItem {
    private final SimpleProduct product;
    private final double quantity;


    public double getValue() {
        return product.getProductPrice() * quantity;
    }
}