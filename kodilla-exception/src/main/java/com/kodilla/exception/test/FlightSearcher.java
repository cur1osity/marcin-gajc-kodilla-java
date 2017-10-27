package com.kodilla.exception.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class FlightSearcher {


    private Map<String, Boolean> flightMap;

    public void findflight(Flight flight) throws RouteNotFoundException {

        if (this.isFlightCanBeFound(flight)) {

            System.out.println("Flight was found" + ": " + flight.getDepartureAirport() +
                    " -> " + flight.getArrivalAirport());

        } else {

            throw new RouteNotFoundException();

        }
    }

    private boolean isFlightCanBeFound(Flight flight) {

        return this.isFlightAvailale(flight) && this.isFlightPossible(flight);
    }

    private boolean isFlightAvailale(Flight flight) {

        return flightMap.containsKey(flight.getArrivalAirport());
    }

    private boolean isFlightPossible(Flight flight) {

            return flightMap.get(flight.getArrivalAirport());
    }

}


