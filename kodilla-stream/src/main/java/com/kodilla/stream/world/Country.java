package com.kodilla.stream.world;

import lombok.Value;
import java.math.BigDecimal;

@Value
public class Country {

    private String countryName;
    private BigDecimal peopleQuantity;


    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

}
