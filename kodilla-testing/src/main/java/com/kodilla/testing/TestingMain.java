package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println();

        Calculator calculator = new Calculator(10, 5);

        System.out.println("Testing addition");

        int results = 15;

        if (results == calculator.addition()) {
            System.out.println("test OK");
        }
        else {
            System.out.println("test failed!");
        }

        System.out.println("Testing subtraction");

        results = 5;

        if (results == calculator.subtraction()) {
            System.out.println("test OK");
        }
        else {
            System.out.println("test failed!");
        }
    }
}