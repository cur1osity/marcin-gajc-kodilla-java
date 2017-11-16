package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(String TaskClass) {

        switch (TaskClass) {

            case SHOPPING:
                return new ShoppingTask("Do shopping");
            case PAINTING:
                return new PaintingTask("Do painting");
            case DRIVING:
                return new DrivingTask("Do driving");
            default:
                return null;
        }

    }

}
