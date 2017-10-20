package com.kodilla.stream.invoice.simple;

import lombok.Value;

@Value
public final class SimpleProduct {
    private final String productName;
    private final double productPrice;

}