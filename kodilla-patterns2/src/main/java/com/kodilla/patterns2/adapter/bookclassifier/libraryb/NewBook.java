package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NewBook {
    private final String author;
    private final String title;
    private final int yearOfPublication;
}
