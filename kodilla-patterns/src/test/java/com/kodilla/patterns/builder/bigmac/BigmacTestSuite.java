package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void Should_have_2_ingredients_When_2_ingredients_where_added_with_builder() {

        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients("cheese")
                .ingredients("onion")
                .burgers(2)
                .roll(Bigmac.Roll.ROLL_WITH_SEZAME)
                .sauce(Bigmac.Sauce.BARBECUE)
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);

    }
}
