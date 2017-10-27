package com.kodilla.exception.test;

import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FlightTestSuite {


    private List<Flight> getFlights() {

        Flight flight1 = new Flight("Warsaw", "Moscow");
        Flight flight2 = new Flight("Warsaw", "London");
        Flight flight3 = new Flight("Warsaw", "New York");

        List<Flight> flightList = new ArrayList<>();

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);

        return flightList;
    }

    @Test(expected = RouteNotFoundException.class)
    public void Should_throw_exception_When_Route_doesnt_exist() throws RouteNotFoundException {

        // given
        List<Flight> flights = getFlights();
        FlightSearcher flightSearcher = new FlightSearcher(new HashMap<>());
        flightSearcher.getFlightMap().put("Tokio", true);

        //when
        for (Flight flight : flights) {
            flightSearcher.findflight(flight);
        }

        //then
        //expected exception was thrown

    }

    @Test(expected = RouteNotFoundException.class)
    public void Should_throw_exception_When_Route_Is_False() throws RouteNotFoundException {

        // given
        List<Flight> flights = getFlights();
        FlightSearcher flightSearcher = new FlightSearcher(new HashMap<>());
        flightSearcher.getFlightMap().put("Moscow", false);

        // when
        for (Flight flight : flights) {
            flightSearcher.findflight(flight);
        }

        //then
        //expected exception was thrown
    }

    @Test
    public void Should_Find_Flights_When_Route_Is_Available() throws RouteNotFoundException {

        // given
        List<Flight> flights = getFlights();
        FlightSearcher flightSearcher = new FlightSearcher(new HashMap<>());
        flightSearcher.getFlightMap().put("Moscow", true);
        flightSearcher.getFlightMap().put("London", true);
        flightSearcher.getFlightMap().put("New York", true);

        // when
        for (Flight flight : flights) {
            flightSearcher.findflight(flight);
        }

        //then
        //no exception was thrown
    }
}