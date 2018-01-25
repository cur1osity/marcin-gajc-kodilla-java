package com.kodilla.patterns2.adapter.bookclassifier.librarya;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OldBook {
    private final String author;
    private final String title;
    private final int publicationYear;
    private final String signature;
}
