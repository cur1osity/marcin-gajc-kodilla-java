package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        // Given
        // Create continents and add countries
        List<Country> europe = new ArrayList<>();

        europe.add(new Country("Poland",new BigDecimal("40000000")));
        europe.add(new Country("Germany",new BigDecimal("80000000")));
        europe.add(new Country("England",new BigDecimal("100000000")));

        List<Country> asia = new ArrayList<>();

        asia.add(new Country("Japan",new BigDecimal("100000000")));
        asia.add(new Country("China",new BigDecimal("1000000000")));

        World world = new World();
        world.getContinents().add(new Continent(asia));
        world.getContinents().add(new Continent(europe));

        BigDecimal expectedPeople = new BigDecimal("1320000000");

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(expectedPeople, peopleQuantity);

    }
}
