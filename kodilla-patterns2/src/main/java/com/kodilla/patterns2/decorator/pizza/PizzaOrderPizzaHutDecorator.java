package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaOrderPizzaHutDecorator extends AbstractPizzaOrderDecorator {

    public PizzaOrderPizzaHutDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " , pepperoni, paprika";
    }
}
