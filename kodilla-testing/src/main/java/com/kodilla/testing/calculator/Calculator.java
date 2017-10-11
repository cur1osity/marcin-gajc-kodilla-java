package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;
    private int answer;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addition() {

        answer = a + b;

//        System.out.println(a + " + " + b + " = " + answer );
//        System.out.println("--------------------");
        return answer;
    }

    public int subtraction() {

        answer = a - b;

//        System.out.println(a + " - " + b + " = " + answer );
//        System.out.println("--------------------");
        return answer;
    }

}