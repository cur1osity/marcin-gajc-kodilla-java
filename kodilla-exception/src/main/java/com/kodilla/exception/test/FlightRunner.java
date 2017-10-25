package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightRunner {

    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher(new HashMap<>());

        flightSearcher.getFlightMap().put("Moscow", true);
        flightSearcher.getFlightMap().put("London", false);

        Flight flight1 = new Flight("Warsaw","Moscow");
        Flight flight2 = new Flight("Warsaw","London");

        try {
            flightSearcher.findflight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight cannot be found");;
        }

        try {
            flightSearcher.findflight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight cannot be found");;
        }
    }
}
