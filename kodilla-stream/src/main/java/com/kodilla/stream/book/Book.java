package com.kodilla.stream.book;

import lombok.Value;

@Value
public final class Book {


    private String author;
    private String title;
    private int yearOfPublication;
    private String signature;


}