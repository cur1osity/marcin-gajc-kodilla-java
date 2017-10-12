package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {

        shapes.add(shape);

    }

    public boolean removeFigure(Shape shape) {

        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
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
