package com.kodilla.good.patterns.challenge4;


import lombok.Value;

import java.util.ArrayList;
import java.util.List;


@Value
public class FlightRepo {

    private List<Flight> flights = new ArrayList<>();

    public FlightRepo(){}

    public void addFlight (Flight flight) {

        if (!flights.contains(flight)) {

            flights.add(flight);
        }

    }

}
