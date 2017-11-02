package com.kodilla.good.patterns.challenge2;

import lombok.Value;

@Value
public class Flight {

    private String departureAirport;
    private String arrivalAirport;
    private String transferAirport;
    private boolean isDirect;

}
