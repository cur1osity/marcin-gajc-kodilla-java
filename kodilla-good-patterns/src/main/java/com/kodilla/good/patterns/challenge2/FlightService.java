package com.kodilla.good.patterns.challenge2;

import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class FlightService {

    private FlightRepo flightRepo;

    public List<Flight> findFlightsFromCity(Airports airport) {

        List<Flight> departureList = flightRepo.getFlights().stream()
                .filter(f -> f.isDirect() == true)
                .filter(f -> f.getDepartureAirport() == airport.getAirport())
                .collect(Collectors.toList());

        return departureList;
    }

    public List<Flight> findFlightsToCity(Airports airport) {

        List<Flight> arrivalList = flightRepo.getFlights().stream()
                .filter(f -> f.isDirect() == true)
                .filter(f -> f.getArrivalAirport() == airport.getAirport())
                .collect(Collectors.toList());

        return arrivalList;

    }

    public List<Flight> findIndirectFlightsFromCity(Airports airport) {

        List<Flight> indirectFlights = flightRepo.getFlights().stream()
                .filter(f -> f.isDirect() == false)
                .filter(f -> f.getArrivalAirport() == airport.getAirport())
                .collect(Collectors.toList());

        return indirectFlights;

    }

    public List<Flight> findIndirectFlightsToCity(Airports airport) {

        List<Flight> indirectFlights = flightRepo.getFlights().stream()
                .filter(f -> f.isDirect() == false)
                .filter(f -> f.getDepartureAirport() == airport.getAirport())
                .collect(Collectors.toList());

        return indirectFlights;

    }
}
