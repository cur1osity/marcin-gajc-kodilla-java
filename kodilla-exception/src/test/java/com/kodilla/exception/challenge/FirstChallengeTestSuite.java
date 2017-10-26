package com.kodilla.exception.challenge;

import org.junit.Assert;

import org.junit.Test;


public class FirstChallengeTestSuite {



    @Test
    public void Should_caught_exception_When_divide_by_0() {

        //given
        FirstChallenge firstChallenge = new FirstChallenge();

        //when
        String exception ="";

        try {
            firstChallenge.divide(1, 0);
        } catch (ArithmeticException e) {
            exception = e.toString();
        }

        //then
        Assert.assertEquals("",exception);

    }
}
