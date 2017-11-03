package com.kodilla.good.patterns.challenge2;

import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;


public class FlightService {

    // uznalem ze najlepiej bedzie jak lotnisko poczatkowe to bedzie pierwszy element w liscie
    // a koncowe to ostatni element w liscie

    private String airportName;
    private FlightRepo flightRepo;

    public FlightService(FlightRepo flightRepo) {
        this.flightRepo = flightRepo;
    }

    public List<Flight> findFlightsFromCity(Airport airport) {

        airportName = airport.getName();

        return flightRepo.getFlights().stream()
                .filter(f -> f.getFlights().get(0).getName().equals(airportName))
                .collect(Collectors.toList());

    }

    public List<Flight> findFlightsToCity(Airport airport) {

        airportName = airport.getName();

        return flightRepo.getFlights().stream()
                .filter(f -> f.getFlights().get(f.getFlights().size()-1).getName().equals(airportName))
                .collect(Collectors.toList());

    }

    public List<Flight> findIndirectFlightsFromCity(Airport airport) {

        airportName = airport.getName();

        return flightRepo.getFlights().stream()
                .filter(f -> f.getFlights().get(0).getName().equals(airportName))
                .filter(f -> f.getFlights().size() > 2)
                .collect(Collectors.toList());

    }

    public List<Flight> findIndirectFlightsToCity(Airport airport) {

        airportName = airport.getName();

        return flightRepo.getFlights().stream()
                .filter(f -> f.getFlights().get(f.getFlights().size()-1).getName().equals(airportName))
                .filter(f -> f.getFlights().size() > 2)
                .collect(Collectors.toList());

    }

}
