package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenge2.Airports;
import com.kodilla.good.patterns.challenge2.Flight;
import com.kodilla.good.patterns.challenge2.FlightRepo;
import com.kodilla.good.patterns.challenge2.FlightService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FlightsTestSuite {

    private Airports airport;
    private FlightRepo flightRepo;
    private FlightService flightService;


    public List<Flight> getFlights() {

        List<Flight> flightList = new ArrayList<>();

        Flight flight1 = new Flight("Warszawa", "Krakow", "none", true);
        Flight flight2 = new Flight("Gdansk", "Poznan", "none", true);
        Flight flight3 = new Flight("Zakopane", "Szczecin", "none", true);
        Flight flight4 = new Flight("Warszawa", "Krakow", "Poznan", false);
        Flight flight5 = new Flight("Warszawa", "Wroclaw", "Gdansk", false);
        Flight flight6 = new Flight("Warszawa", "Szczecin", "none", true);
        Flight flight7 = new Flight("Krakow", "Warszawa", "none", true);
        Flight flight8 = new Flight("Gdansk", "Warszawa", "none", true);
        Flight flight9 = new Flight("Krakow", "Warszawa", "Poznan", false);
        Flight flight10 = new Flight("Gdansk", "Warszawa", "Szczecin", false);

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);
        flightList.add(flight7);
        flightList.add(flight8);
        flightList.add(flight9);
        flightList.add(flight10);

        return flightList;

    }

    @Before
    public void setup() {

        airport = new Airports("Warszawa");
        flightRepo = new FlightRepo(getFlights());
        flightService = new FlightService(flightRepo);

    }

    @Test
    public void Should_have_2_elements_When_finds_direct_flights_from_Warsaw() {

        //given
        //@Before

        //when
        int numbersOfFlights = flightService.findFlightsFromCity(airport).size();

        //then
        Assert.assertEquals(2, numbersOfFlights);

    }

    @Test
    public void Should_have_2_elements_When_finds_direct_flights_to_Warsaw() {

        //given
        //@Before

        //when
        int numbersOfFlights = flightService.findFlightsToCity(airport).size();

        //then
        Assert.assertEquals(2, numbersOfFlights);

    }

    @Test
    public void Should_have_2_elements_When_finds_indirect_flights_from_Warsaw() {

        //given
        //@Before

        //when
        int numbersOfFlights = flightService.findIndirectFlightsFromCity(airport).size();

        //then
        Assert.assertEquals(2, numbersOfFlights);

    }

    @Test
    public void Should_have_2_elements_When_finds_indirect_flights_to_Warsaw() {

        //given
        //@Before

        //when
        int numbersOfFlights = flightService.findIndirectFlightsToCity(airport).size();

        //then
        Assert.assertEquals(2, numbersOfFlights);

    }

}
