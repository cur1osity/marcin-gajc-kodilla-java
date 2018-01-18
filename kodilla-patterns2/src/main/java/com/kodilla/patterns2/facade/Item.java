package com.kodilla.patterns2.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Item {

    private final Long productId;
    private final double qty;

}
