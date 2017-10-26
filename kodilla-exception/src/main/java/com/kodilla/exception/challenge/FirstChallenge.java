package com.kodilla.exception.challenge;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Can't divde by 0: " + e);

        } finally {

            if(b == 0){
                return a/b;
            }

            return a/b;

        }
    }
}
