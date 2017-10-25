package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {


    static double getAverage(int[] numbers){

       IntStream.range(0, numbers.length)
                .forEach(i -> System.out.println(numbers[i]));

       double average = IntStream.of(numbers)
               .average().getAsDouble();


        return average;
    }

}

