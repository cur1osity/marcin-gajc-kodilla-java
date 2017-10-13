package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {

        shapes.add(shape);

    }

    public void removeFigure(Shape shape) {

        if (shapes.contains(shape)) {
            shapes.remove(shape);
        }
    }


    public String getFigure(int n) {
        return shapes.get(n).getShapeName();
    }

    public ArrayList<Shape> showFigures() {
        return shapes;
    }

    public int getFiguresQuantity() {
        return shapes.size();
    }

}
