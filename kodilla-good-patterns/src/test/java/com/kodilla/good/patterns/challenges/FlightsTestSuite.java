package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenge2.Airport;
import com.kodilla.good.patterns.challenge2.Flight;
import com.kodilla.good.patterns.challenge2.FlightRepo;
import com.kodilla.good.patterns.challenge2.FlightService;
import org.junit.Assert;
import org.junit.Test;


public class FlightsTestSuite {

    private FlightService flightService;
    private Airport warszawa = new Airport("Warszawa");
    private Airport krakow = new Airport("Krakow");
    private Airport wroclaw = new Airport("Wroclaw");
    private Airport poznan = new Airport("Poznan");
    private Airport gdansk = new Airport("Gdansk");


    private void repoAndFlightServiceSetup() {

        Flight flight1 = new Flight();

        flight1.addAirport(warszawa);
        flight1.addAirport(krakow);

        Flight flight2 = new Flight();

        flight2.addAirport(warszawa);
        flight2.addAirport(wroclaw);

        Flight flight3 = new Flight();

        flight3.addAirport(poznan);
        flight3.addAirport(gdansk);
        flight3.addAirport(warszawa);


        Flight flight4 = new Flight();

        flight4.addAirport(warszawa);
        flight4.addAirport(poznan);
        flight4.addAirport(wroclaw);
        flight4.addAirport(gdansk);

        FlightRepo flightRepo = new FlightRepo();

        flightRepo.addFlight(flight1);
        flightRepo.addFlight(flight2);
        flightRepo.addFlight(flight3);
        flightRepo.addFlight(flight4);

        flightService = new FlightService(flightRepo);

    }

    @Test
    public void Should_have_3_elements_When_finds_flights_from_Warsaw() {

        //given
        repoAndFlightServiceSetup();

        //when
        int numbersOfFlights = flightService.findFlightsFromCity(warszawa).size();

        //then
        Assert.assertEquals(3, numbersOfFlights);

    }

    @Test
    public void Should_have_1_elements_When_finds_flights_to_Warsaw() {

        //given
        repoAndFlightServiceSetup();


        //when
        int numbersOfFlights = flightService.findFlightsToCity(warszawa).size();

        //then
        Assert.assertEquals(1 , numbersOfFlights);

    }

    @Test
    public void Should_have_1_element_When_finds_indirect_flights_from_Warsaw() {

        //given
        repoAndFlightServiceSetup();

        //when
        int numbersOfFlights = flightService.findIndirectFlightsFromCity(warszawa).size();

        //then
        Assert.assertEquals(1, numbersOfFlights);

    }

    @Test
    public void Should_have_1_elements_When_finds_indirect_flights_to_Warsaw() {

        //given
        repoAndFlightServiceSetup();

        //when
        int numbersOfFlights = flightService.findIndirectFlightsToCity(warszawa).size();

        //then
        Assert.assertEquals(1, numbersOfFlights);

    }
}
