package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        int[] array = {1, 4, 23, 100, 45, 12, 18, 32, 54, 120, 33, 187, 300, 12, 55, 106, 200, 5, 55, 12};


        Assert.assertEquals(68.7, ArrayOperations.getAverage(array),0.001);

    }
}
