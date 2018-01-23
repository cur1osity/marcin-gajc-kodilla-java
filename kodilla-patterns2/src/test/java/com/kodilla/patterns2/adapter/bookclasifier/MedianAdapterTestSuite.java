package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclassifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.OldBook;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;


public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){

        // Given
        Set<OldBook> oldBooksList = new HashSet<>();
        oldBooksList.add(new OldBook("J.R.R. Tolkien", "Wladca Pierscieni", 1932, "ABC123"));
        oldBooksList.add(new OldBook("Ernest Hemingway", "Stary czlowiek i morze", 1960, "DEF234"));
        oldBooksList.add(new OldBook("George Orwell", "Rok 1984", 1984, "XYZ098"));
        oldBooksList.add(new OldBook("R. R. Martin", "Gra o tron", 2015, "XYZ098"));
        oldBooksList.add(new OldBook("Andrzej Sapkowski", "Wiedzmin", 1995, "XYZ098"));

        // When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(oldBooksList);

        // Then
        Assert.assertEquals(median, 1984);
    }
}