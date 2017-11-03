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

        flight1.getFlights().add(warszawa);
        flight1.getFlights().add(krakow);

        Flight flight2 = new Flight();

        flight2.getFlights().add(warszawa);
        flight2.getFlights().add(wroclaw);

        Flight flight3 = new Flight();

        flight3.getFlights().add(poznan);
        flight3.getFlights().add(gdansk);
        flight3.getFlights().add(warszawa);


        Flight flight4 = new Flight();

        flight4.getFlights().add(warszawa);
        flight4.getFlights().add(poznan);
        flight4.getFlights().add(wroclaw);
        flight4.getFlights().add(gdansk);

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
