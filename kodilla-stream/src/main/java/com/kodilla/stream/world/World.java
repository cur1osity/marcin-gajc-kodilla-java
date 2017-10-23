package com.kodilla.stream.world;

import lombok.Value;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Value
public class World {

    private List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {

            return continents.stream()
                    .flatMap(country -> country.getCountries().stream())
                    .map(Country::getPeopleQuantity)
                    .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
