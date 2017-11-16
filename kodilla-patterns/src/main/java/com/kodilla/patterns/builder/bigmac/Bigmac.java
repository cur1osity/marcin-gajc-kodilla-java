package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    public enum Roll {
        ROLL_WITH_SEZAME, ROLL_WITHOUTSEZAME
    }

    public enum Sauce {
        STANDARD, THOUSAND_ISLANDS, BARBECUE
    }

    private final Roll roll;
    private final Sauce sauce;
    private final int burgers;
    private final List<String> ingredients;

    public static class BigmacBuilder {

        private Roll roll;
        private Sauce sauce;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(Roll roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, sauce, burgers, ingredients);
        }
    }

    private Bigmac(final Roll roll,final Sauce sauce, final int burgers, final List<String> ingredients) {
        this.roll = roll;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Roll getRoll() {
        return roll;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll=" + roll +
                ", sauce=" + sauce +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
