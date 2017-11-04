package com.kodilla.good.patterns.challenge1;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String movieCollection1 = movieStore.getMovies().entrySet().stream()
                .flatMap(f -> f.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieCollection1);



        String movieCollection2 = movieStore.getMovies().values().stream()
                .flatMap(f -> f.stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieCollection2);

    }
}
