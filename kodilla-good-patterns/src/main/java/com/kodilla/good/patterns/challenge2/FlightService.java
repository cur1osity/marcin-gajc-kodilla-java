package com.kodilla.good.patterns.challenge2;

import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class FlightService {

    // uznalem ze najlepiej bedzie jak lotnisko poczatkowe to bedzie pierwszy element w liscie
    // a koncowe to ostatni element w liscie


    private FlightRepo flightRepo;

    public List<Flight> findFlightsFromCity(Airports airport) {

        return flightRepo.getFlights().stream()
                .filter(f -> f.getFlights().get(0).getName().equals(airport.getName()))
                .collect(Collectors.toList());

    }

    public List<Flight> findFlightsToCity(Airports airport) {

        return flightRepo.getFlights().stream()
                .filter(f -> f.getFlights().get(f.getFlights().size()-1).getName().equals(airport.getName()))
                .collect(Collectors.toList());

    }
}
