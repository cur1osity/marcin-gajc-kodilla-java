package com.kodilla.spring.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CircleX implements Shape {

//@Autowired
//@Qualifier("circleX")
//private Shape shape;


    @Override
    public String getShapeName() {
        return "This is a circle.";
    }
}