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
    public void testAddFigure() {

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(10));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(5,10));

        Assert.assertEquals(3, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigure() {

        ShapeCollector shapeCollector = new ShapeCollector();

        Circle circle = new Circle(10);

        shapeCollector.addFigure(circle);

        boolean result = shapeCollector.removeFigure(circle);

        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(10));

        Assert.assertEquals("Circle", shapeCollector.getFigure(0));
    }

    @Test
    public void testShowFigures() {

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(10));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(5,10));

        if(shapeCollector.getFiguresQuantity() > 0) {
            Assert.assertEquals(shapeCollector.getFigure(0), shapeCollector.showFigures().get(0).getShapeName());
        }
        else {
            Assert.fail();
        }
    }
}
