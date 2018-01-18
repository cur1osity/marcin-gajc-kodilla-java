package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderDominoGetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDominoDecorator(theOrder);
        // When
        BigDecimal calculatorPrice = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(20), calculatorPrice);
    }
    @Test
    public void testPizzaOrderDominoGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderDominoDecorator(theOrder);
        // When
        String pizzaName = theOrder.getPizzaDescription();
        // Then
        assertEquals("Mozzarella , tomato sauce , mushrooms, basil, red  onion, sliced tomatoes, sausage", pizzaName);
    }

    @Test
    public void testPizzaOrderPizzaHutGetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderPizzaHutDecorator(theOrder);
        // When
        BigDecimal calculatorPrice = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(22), calculatorPrice);
    }

    @Test
    public void testPizzaOrderPizzaHutDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderPizzaHutDecorator(theOrder);
        // When
        String pizzaName = theOrder.getPizzaDescription();
        // Then
        assertEquals("Mozzarella , tomato sauce , pepperoni, paprika", pizzaName);
    }


    @Test
    public void testPizzaOrderTelePizzaGetPrice() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderTelePizzaDecorator(theOrder);
        // When
        BigDecimal calculatorPrice = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(35), calculatorPrice);
    }

    @Test
    public void testPizzaOrderTelePizzaDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new PizzaOrderTelePizzaDecorator(theOrder);
        // When
        String pizzaName = theOrder.getPizzaDescription();
        // Then
        assertEquals("Mozzarella , tomato sauce , parmesan, garlic, ham", pizzaName);

    }
}

