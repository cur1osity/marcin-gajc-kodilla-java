package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaOrderDecorator2 extends AbstractPizzaOrderDecorator {

    public PizzaOrderDecorator2(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", pepperoni, paprika, sausage";
    }
}
