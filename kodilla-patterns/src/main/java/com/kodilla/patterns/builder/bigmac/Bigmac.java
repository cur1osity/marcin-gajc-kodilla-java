package com.kodilla.patterns.builder.bigmac;

import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Builder
@Value
public class Bigmac {

    public enum Roll {
        ROLL_WITH_SEZAME, ROLL_WITHOUT_SEZAME
    }

    public enum Sauce {
        STANDARD, THOUSAND_ISLANDS, BARBECUE
    }

    private final Roll roll;
    private final Sauce sauce;
    private final int burgers;
    private final List<String> ingredients;

    public static class BigmacBuilder {

        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }
    }
}
