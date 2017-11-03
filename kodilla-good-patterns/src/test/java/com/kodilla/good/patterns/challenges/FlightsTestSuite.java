package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenge2.Airports;
import com.kodilla.good.patterns.challenge2.Flight;
import com.kodilla.good.patterns.challenge2.FlightRepo;
import com.kodilla.good.patterns.challenge2.FlightService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FlightsTestSuite {

    private Airports airport;
    private FlightService flightService;


    @Before
    public void repoAndFlightServiceSetup() {

        Flight flight1 = new Flight();

        flight1.getFlights().add(new Airports("Warszawa"));
        flight1.getFlights().add(new Airports("Krakow"));

        Flight flight2 = new Flight();

        flight2.getFlights().add(new Airports("Warszawa"));
        flight2.getFlights().add(new Airports("Wroclaw"));

        Flight flight3 = new Flight();

        flight3.getFlights().add(new Airports("Poznan"));
        flight3.getFlights().add(new Airports("Gdansk"));
        flight3.getFlights().add(new Airports("Warszawa"));


        Flight flight4 = new Flight();

        flight4.getFlights().add(new Airports("Warszawa"));
        flight4.getFlights().add(new Airports("Poznan"));
        flight4.getFlights().add(new Airports("Moskwa"));
        flight4.getFlights().add(new Airports("Gdansk"));

        FlightRepo flightRepo = new FlightRepo();

        flightRepo.getFlights().add(flight1);
        flightRepo.getFlights().add(flight2);
        flightRepo.getFlights().add(flight3);
        flightRepo.getFlights().add(flight4);

        flightService = new FlightService(flightRepo);
    }

    @Test
    public void Should_have_3_elements_When_finds_flights_from_Warsaw() {

        //given
        airport = new Airports("Warszawa");

        //when
        int numbersOfFlights = flightService.findFlightsFromCity(airport).size();

        //then
        Assert.assertEquals(3, numbersOfFlights);

//        List<Flight> airportsList = flightService.findFlightsFromCity(airport);
//
//        for (Flight airport : airportsList) {
//            System.out.println(airport);
//        }
    }

    @Test
    public void Should_have_1_elements_When_finds_flights_to_Warsaw() {

        //given
        airport = new Airports("Warszawa");


        //when
        int numbersOfFlights = flightService.findFlightsToCity(airport).size();

        //then
        Assert.assertEquals(1 , numbersOfFlights);

//        List<Flight> airportsList = flightService.findFlightsToCity(airport);
//
//        for (Flight airport : airportsList) {
//            System.out.println(airport);
//        }

    }
}
