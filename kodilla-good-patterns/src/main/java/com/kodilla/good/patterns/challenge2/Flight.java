package com.kodilla.good.patterns.challenge2;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;


@Value
public class Flight {

    private List<Airports> flights = new ArrayList<>();

    public Flight(){}

}
