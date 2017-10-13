package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void Should_HaveQuantityLessThan3_When_FailToAddFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(10));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(5,10));
        //Then
        Assert.assertEquals(3, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void Should_HaveQuantiityMoreThan0_When_FailToRemoveFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void Should_NotHaveAName_When_FailToGetFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(10));
        //Then
        Assert.assertEquals("Circle", shapeCollector.getFigure(0));
    }

    @Test
    public void Should_HaveSizeLessThan3_When_FailToShowFigures() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(10));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(5,10));
        //Then
        Assert.assertEquals(3, shapeCollector.showFigures().size());

    }
}
