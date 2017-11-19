package com.kodilla.patterns.prototype.library;

import lombok.Value;

import java.time.LocalDate;

@Value
public final class Book {
    final String title;
    final String author;
    final LocalDate publicationDate;

}