package com.kodilla.exception.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class FlightSearcher {


    private Map<String, Boolean> flightMap;

    public void findflight(Flight flight) throws RouteNotFoundException {

        if (isFlightCanBeFound(flight)) {

            System.out.println("Flight was found" + ": " + flight.getDepartureAirport() +
                    " -> " + flight.getArrivalAirport());

        } else {

            throw new RouteNotFoundException();

        }
    }

    private boolean isFlightCanBeFound(Flight flight) {

        return isFlightAvailable(flight) && isFlightPossible(flight);
    }

    private boolean isFlightAvailable(Flight flight) {

        return flightMap.containsKey(flight.getArrivalAirport());
    }

    private boolean isFlightPossible(Flight flight) {

            return flightMap.get(flight.getArrivalAirport());
    }

}


