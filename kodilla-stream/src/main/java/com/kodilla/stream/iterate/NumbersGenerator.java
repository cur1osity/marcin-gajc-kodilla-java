package com.kodilla.stream.iterate;

import java.util.stream.*;

public final class NumbersGenerator {
    public void generateEven(int max) {
        Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 != 0)
                .forEach(i -> System.out.println(i));
    }
}