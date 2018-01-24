package com.kodilla.patterns2.decorator.pizza;


import java.math.BigDecimal;

public class PizzaOrderDecorator3 extends AbstractPizzaOrderDecorator {
    public PizzaOrderDecorator3(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + ", parmesan, garlic, ham";
    }
}
