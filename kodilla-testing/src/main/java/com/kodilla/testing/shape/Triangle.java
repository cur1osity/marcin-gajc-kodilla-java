package com.kodilla.testing.shape;

public class Triangle implements Shape {

   private double height;
   private double lengthOfBase;

    public Triangle(double height, double lengthOfBase) {
        this.height = height;
        this.lengthOfBase = lengthOfBase;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 0.5*height*lengthOfBase;
    }
}
