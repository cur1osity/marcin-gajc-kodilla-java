package com.kodilla.exception.challenge;

import org.junit.Assert;

import org.junit.Test;


public class FirstChallengeTestSuite {


    @Test(expected = ArithmeticException.class)
    public void Should_throw_exception_When_divide_by_0() {

        //given
        FirstChallenge firstChallenge = new FirstChallenge();

        // ???
        try {
            firstChallenge.divide(1,0);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by 0");
        }
    }

    @Test
    public void Should_not_throw_exception_When_divide_by_other_than_0() {

        //given
        FirstChallenge firstChallenge = new FirstChallenge();

        //when
        double result = firstChallenge.divide(2,4);

        //then
        Assert.assertEquals(0.5,result,0.001);

    }
}

