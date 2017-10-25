package com.kodilla.exception.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class FlightSearcher {

    private Map<String, Boolean> flightMap;

    public void findflight(Flight flight) throws RouteNotFoundException {

        if(flightMap.containsKey(flight.getArrivalAirport()) &&
                (flightMap.get(flight.getArrivalAirport()) == true)) {

            System.out.println("Flight was found" + ": " + flight.getDepartureAirport() +
            " -> " + flight.getArrivalAirport());

        } else {

            throw new RouteNotFoundException();

        }
    }

}
