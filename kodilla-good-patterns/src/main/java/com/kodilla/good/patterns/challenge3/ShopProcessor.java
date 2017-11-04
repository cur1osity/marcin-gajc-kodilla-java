package com.kodilla.good.patterns.challenge3;

import lombok.Value;

@Value
public class ShopProcessor {

    public ProductDto generate(final OrderRequest orderRequest) {

        boolean isOrdered = orderRequest.getShop().process(orderRequest);

        if(isOrdered) {
            return new ProductDto(orderRequest.getShop(), true);
        } else {
            return new ProductDto(orderRequest.getShop(), false);
        }

    }
}
