package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void Should_have_2_ingredients_When_2_ingredients_where_added_with_builder() {

        // given
        Bigmac.BigmacBuilder builder = new Bigmac.BigmacBuilder();
        final Bigmac.BigmacBuilder bigmacBuilder = builder
                .ingredients("cheese")
                .ingredients("onion")
                .burgers(2)
                .roll(Bigmac.Roll.ROLL_WITH_SEZAME)
                .sauce(Bigmac.Sauce.BARBECUE);

        // when
        Bigmac bigmac = bigmacBuilder.build();

        // then
        System.out.println(bigmac);
        int howManyIngredients = bigmac.getIngredients().size();
        Assert.assertEquals(2, howManyIngredients);

    }
}