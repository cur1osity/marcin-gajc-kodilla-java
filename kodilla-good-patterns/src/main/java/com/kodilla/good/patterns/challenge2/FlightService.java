package com.kodilla.good.patterns.challenge2;


import java.util.List;
import java.util.stream.Collectors;


public class FlightService {

    private FlightRepo flightRepo;

    public FlightService(FlightRepo flightRepo) {
        this.flightRepo = flightRepo;
    }

    public List<Flight> findFlightsFromCity(Airport airport) {

        return flightRepo.getFlights().stream()
                .filter(f -> {
                    String name = f.getAirports().get(0).getName();
                    return name.equals(airport.getName()); })
                .collect(Collectors.toList());

    }

    public List<Flight> findFlightsToCity(Airport airport) {

        return flightRepo.getFlights().stream()
                .filter(f -> {
                    String name = f.getAirports().get(f.getAirports().size()-1).getName();
                    return name.equals(airport.getName()); })
                .collect(Collectors.toList());

    }

    public List<Flight> findIndirectFlightsFromCity(Airport airport) {

        return flightRepo.getFlights().stream()
                .filter(f -> {
                    String name = f.getAirports().get(0).getName();
                    return name.equals(airport.getName()); })
                .filter(f -> f.getAirports().size() > 2)
                .collect(Collectors.toList());

    }

    public List<Flight> findIndirectFlightsToCity(Airport airport) {

        return flightRepo.getFlights().stream()
                .filter(f -> {
                    String name = f.getAirports().get(f.getAirports().size()-1).getName();
                    return name.equals(airport.getName()); })
                .filter(f -> f.getAirports().size() > 2)
                .collect(Collectors.toList());

    }
}
