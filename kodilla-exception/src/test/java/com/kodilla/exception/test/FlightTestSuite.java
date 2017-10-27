package com.kodilla.exception.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FlightTestSuite {


    private List<Flight> getFlight() {

        Flight flight1 = new Flight("Warsaw", "Moscow");
        Flight flight2 = new Flight("Warsaw", "London");
        Flight flight3 = new Flight("Warsaw", "New York");

        List<Flight> flightList = new ArrayList<>();

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);

        return flightList;
    }


    @Test
    public void Should_caught_exception_When_Route_doesnt_exist()  {

        // given

        FlightSearcher flightSearcher = new FlightSearcher(new HashMap<>());

        flightSearcher.getFlightMap().

                put("Moscow", true);
        flightSearcher.getFlightMap().

                put("London", false);


        // ???


        for (Flight flight : getFlight()) {

            try {flightSearcher.findflight(flight);

            } catch (RouteNotFoundException e) {
                System.out.println(e + ": Flight cannot be found");

            }
        }
    }
}