package com.kodilla.good.patterns.challenge2;


import java.util.List;
import java.util.stream.Collectors;


public class FlightService {

    // uznalem ze najlepiej bedzie jak lotnisko poczatkowe to bedzie pierwszy element w liscie
    // a koncowe to ostatni element w liscie

    private FlightRepo flightRepo;

    public FlightService(FlightRepo flightRepo) {
        this.flightRepo = flightRepo;
    }

    public List<Flight> findFlightsFromCity(Airport airport) {

        return flightRepo.getFlights().stream()
                .filter(f -> {
                    String name = f.getFlights().get(0).getName();
                    return name.equals(airport.getName()); })
                .collect(Collectors.toList());

    }

    public List<Flight> findFlightsToCity(Airport airport) {

        return flightRepo.getFlights().stream()
                .filter(f -> {
                    String name = f.getFlights().get(f.getFlights().size()-1).getName();
                    return name.equals(airport.getName()); })
                .collect(Collectors.toList());

    }

    public List<Flight> findIndirectFlightsFromCity(Airport airport) {

        return flightRepo.getFlights().stream()
                .filter(f -> {
                    String name = f.getFlights().get(0).getName();
                    return name.equals(airport.getName()); })
                .filter(f -> f.getFlights().size() > 2)
                .collect(Collectors.toList());

    }

    public List<Flight> findIndirectFlightsToCity(Airport airport) {

        return flightRepo.getFlights().stream()
                .filter(f -> {
                    String name = f.getFlights().get(f.getFlights().size()-1).getName();
                    return name.equals(airport.getName()); })
                .filter(f -> f.getFlights().size() > 2)
                .collect(Collectors.toList());

    }
}
