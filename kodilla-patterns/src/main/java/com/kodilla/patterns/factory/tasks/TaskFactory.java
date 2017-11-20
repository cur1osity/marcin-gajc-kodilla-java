package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public enum Tasks {
        SHOPPING, DRIVING, PAINTING
    }

    public final Task makeTask(Tasks task) {

        switch (task) {

            case SHOPPING:
                return new ShoppingTask("Do shopping");
            case PAINTING:
                return new PaintingTask("Do painting");
            case DRIVING:
                return new DrivingTask("Do driving");
            default:
                throw new IllegalArgumentException();
        }

    }

}
