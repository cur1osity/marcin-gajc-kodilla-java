package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier("Bla bla bla");

        poemBeautifier.beautify(n -> n.toUpperCase());
        poemBeautifier.beautify(n -> n.toLowerCase());
        poemBeautifier.beautify(n -> "ABC" + n + "ABC");
        poemBeautifier.beautify(n -> n.replace('a','x'));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }

}
