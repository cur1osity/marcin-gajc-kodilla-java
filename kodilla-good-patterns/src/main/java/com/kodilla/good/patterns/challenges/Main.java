package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String movieCollection = movieStore.getMovies().entrySet().stream()
                .flatMap(f -> f.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieCollection);
    }
}
