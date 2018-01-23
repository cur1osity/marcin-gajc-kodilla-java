package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.OldBook;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.NewBook;
import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<OldBook> oldBookSet) {
        Map<BookSignature, NewBook> books = new HashMap<>();

        for (OldBook oldBook : oldBookSet) {
           books.put(new BookSignature(oldBook.getSignature()),
                   new NewBook(oldBook.getAuthor(),
                           oldBook.getTitle(),
                           oldBook.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
