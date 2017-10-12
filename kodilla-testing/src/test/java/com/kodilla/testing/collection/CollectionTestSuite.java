package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    private OddNumbersExterminator oddNumbersExterminator;
    private ArrayList<Integer> numbers1;
    private ArrayList<Integer> numbers2;

    @Before
    public void setup() {
        numbers1 = new ArrayList<>();
        numbers2 = new ArrayList<>();
        numbers2.add(3);
        numbers2.add(1);
        numbers2.add(4);
        numbers2.add(6);

        System.out.println("Starting test...");
    }

    @After
    public void endOfTest() {
        System.out.println("End of test");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {

        oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> numberEven = oddNumbersExterminator.exterminate(numbers1);

        Assert.assertTrue(numberEven.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> numberEven = oddNumbersExterminator.exterminate(numbers2);

        for (Integer number : numberEven) {
            Assert.assertTrue(number % 2 == 0);
        }
    }
}



