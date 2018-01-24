package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrder1GetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDecorator1(theOrder);
        // When
        BigDecimal calculatorPrice = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(20), calculatorPrice);
    }

    @Test
    public void testPizzaOrder1GetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDecorator1(theOrder);
        // When
        String pizzaName = theOrder.getPizzaDescription();
        // Then
        assertEquals("Mozzarella, tomato sauce, mushrooms, basil, red onion, sliced tomatoes", pizzaName);
    }

    @Test
    public void testPizzaOrder2GetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDecorator1(theOrder);
        theOrder = new PizzaOrderDecorator2(theOrder);
        // When
        BigDecimal calculatorPrice = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(25), calculatorPrice);
    }

    @Test
    public void testPizzaOrder2GetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDecorator1(theOrder);
        theOrder = new PizzaOrderDecorator2(theOrder);
        // When
        String pizzaName = theOrder.getPizzaDescription();
        // Then
        assertEquals("Mozzarella, tomato sauce, mushrooms, basil, red onion, sliced tomatoes, pepperoni, paprika, sausage", pizzaName);
    }

    @Test
    public void testPizzaOrder3GetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDecorator1(theOrder);
        theOrder = new PizzaOrderDecorator2(theOrder);
        theOrder = new PizzaOrderDecorator3(theOrder);
        // When
        BigDecimal calculatorPrice = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(30), calculatorPrice);
    }

    @Test
    public void testPizzaOrder3GetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDecorator1(theOrder);
        theOrder = new PizzaOrderDecorator2(theOrder);
        theOrder = new PizzaOrderDecorator3(theOrder);
        // When
        String pizzaName = theOrder.getPizzaDescription();
        // Then
        assertEquals("Mozzarella, tomato sauce, mushrooms, basil, red onion, sliced tomatoes, pepperoni, paprika, sausage, parmesan, garlic, ham", pizzaName);
    }

    @Test
    public void testPizzaOrder4GetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDecorator1(theOrder);
        theOrder = new PizzaOrderDecorator3(theOrder);
        // When
        BigDecimal calculatorPrice = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(25), calculatorPrice);
    }

    @Test
    public void testPizzaOrder4GetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDecorator1(theOrder);
        theOrder = new PizzaOrderDecorator3(theOrder);
        // When
        String pizzaName = theOrder.getPizzaDescription();
        // Then
        assertEquals("Mozzarella, tomato sauce, mushrooms, basil, red onion, sliced tomatoes, parmesan, garlic, ham", pizzaName);
    }

}

