package com.kodilla.patterns2.decorator.pizza;


import java.math.BigDecimal;

public class PizzaOrderTelePizzaDecorator extends AbstractPizzaOrderDecorator {
    public PizzaOrderTelePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " , parmesan, garlic, ham";
    }
}
