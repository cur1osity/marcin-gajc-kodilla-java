package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenge2.Airport;
import com.kodilla.good.patterns.challenge2.Flight;
import com.kodilla.good.patterns.challenge2.FlightRepo;
import com.kodilla.good.patterns.challenge2.FlightService;
import org.junit.Assert;
import org.junit.Test;


public class FlightsTestSuite {

    private Airport airport;
    private FlightService flightService;



    private void repoAndFlightServiceSetup() {

        Flight flight1 = new Flight();

        flight1.getFlights().add(new Airport("Warszawa"));
        flight1.getFlights().add(new Airport("Krakow"));

        Flight flight2 = new Flight();

        flight2.getFlights().add(new Airport("Warszawa"));
        flight2.getFlights().add(new Airport("Wroclaw"));

        Flight flight3 = new Flight();

        flight3.getFlights().add(new Airport("Poznan"));
        flight3.getFlights().add(new Airport("Gdansk"));
        flight3.getFlights().add(new Airport("Warszawa"));


        Flight flight4 = new Flight();

        flight4.getFlights().add(new Airport("Warszawa"));
        flight4.getFlights().add(new Airport("Poznan"));
        flight4.getFlights().add(new Airport("Moskwa"));
        flight4.getFlights().add(new Airport("Gdansk"));

        FlightRepo flightRepo = new FlightRepo();

        flightRepo.getFlights().add(flight1);
        flightRepo.getFlights().add(flight2);
        flightRepo.getFlights().add(flight3);
        flightRepo.getFlights().add(flight4);

        flightService = new FlightService(flightRepo);

        airport = new Airport("Warszawa");
    }

    @Test
    public void Should_have_3_elements_When_finds_flights_from_Warsaw() {

        //given
        repoAndFlightServiceSetup();

        //when
        int numbersOfFlights = flightService.findFlightsFromCity(airport).size();

        //then
        Assert.assertEquals(3, numbersOfFlights);

    }

    @Test
    public void Should_have_1_elements_When_finds_flights_to_Warsaw() {

        //given
        repoAndFlightServiceSetup();


        //when
        int numbersOfFlights = flightService.findFlightsToCity(airport).size();

        //then
        Assert.assertEquals(1 , numbersOfFlights);

    }

    @Test
    public void Should_have_1_element_When_finds_indirect_flights_from_Warsaw() {

        //given
        repoAndFlightServiceSetup();

        //when
        int numbersOfFlights = flightService.findIndirectFlightsFromCity(airport).size();

        //then
        Assert.assertEquals(1, numbersOfFlights);

    }

    @Test
    public void Should_have_1_elements_When_finds_indirect_flights_to_Warsaw() {

        //given
        repoAndFlightServiceSetup();

        //when
        int numbersOfFlights = flightService.findIndirectFlightsToCity(airport).size();

        //then
        Assert.assertEquals(1, numbersOfFlights);

    }
}
