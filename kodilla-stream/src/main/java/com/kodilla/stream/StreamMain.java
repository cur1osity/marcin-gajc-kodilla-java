package com.kodilla.stream;

import com.kodilla.stream.immutable.ForumUser;
import com.kodilla.stream.person.People;

public class StreamMain {
    public static void main(String[] args) {
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf('N')))
  //              .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

    }
}