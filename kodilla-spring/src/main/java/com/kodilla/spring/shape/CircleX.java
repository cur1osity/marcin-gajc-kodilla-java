package com.kodilla.spring.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CircleX implements Shape {

    @Override
    public String getShapeName() {
        return "This is a circle.";
    }
}