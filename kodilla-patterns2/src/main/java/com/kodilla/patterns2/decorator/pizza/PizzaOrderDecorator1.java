package com.kodilla.patterns2.decorator.pizza;


import java.math.BigDecimal;

public class PizzaOrderDecorator1 extends AbstractPizzaOrderDecorator {
    public PizzaOrderDecorator1(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", mushrooms, basil, red onion, sliced tomatoes";
    }
}
