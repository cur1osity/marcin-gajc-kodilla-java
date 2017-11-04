package com.kodilla.good.patterns.challenge4;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;


@Value
public class Flight {

    private List<Airport> airports = new ArrayList<>();

    public Flight(){}

    public void addAirport (Airport airport) {

        if (!airports.contains(airport)) {

            airports.add(airport);
        }

    }

}
