package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    private OddNumbersExterminator oddNumbersExterminator;
    private ArrayList<Integer> numbers;

    @Before
    public void startOfTest() {

        System.out.println("Starting test...");
    }

    @After
    public void endOfTest() {
        System.out.println("End of test");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList() {

        numbers = new ArrayList<>();

        oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> numberEven = oddNumbersExterminator.exterminate(numbers);

        Assert.assertTrue(numberEven.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);

        oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> numberEven = oddNumbersExterminator.exterminate(numbers);

        for (Integer number : numberEven) {
            Assert.assertTrue(number % 2 == 0);
        }
    }
}



