package com.kodilla.good.patterns.challenge2;


import lombok.Value;

import java.util.ArrayList;
import java.util.List;


@Value
public class FlightRepo {

    private List<Flight> flights = new ArrayList<>();

    public FlightRepo(){}

}