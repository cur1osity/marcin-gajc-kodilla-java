package com.kodilla.patterns2.decorator.pizza;


import java.math.BigDecimal;

public class PizzaOrderDominoDecorator extends AbstractPizzaOrderDecorator {
    public PizzaOrderDominoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getPizzaDescription() {
        return super.getPizzaDescription() + " , mushrooms, basil, red  onion, sliced tomatoes, sausage";
    }
}
