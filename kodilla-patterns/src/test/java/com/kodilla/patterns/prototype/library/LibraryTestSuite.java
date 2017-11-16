package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {

    private Library library;

    private Set createBooks() {

        Set<Book> books = new HashSet<>();

        books.add(new Book("Book1","Author1", LocalDate.of(2000,1,1)));
        books.add(new Book("Book2","Author2", LocalDate.of(2001,1,1)));
        books.add(new Book("Book3","Author3", LocalDate.of(2002,1,1)));
        books.add(new Book("Book4","Author4", LocalDate.of(2003,1,1)));
        books.add(new Book("Book5","Author5", LocalDate.of(2004,1,1)));

        return books;
    }

    @Before
    public void librarySetup() {

        library = new Library("Library1");

        library.getBooks().addAll(createBooks());

    }


    @Test
    public void Should_have_same_number_of_elements_after_add_When_shallow_copy_is_used() {

        // given

        Library libraryShallowCopy = null;

        try {
            libraryShallowCopy = library.shallowCopy();
            libraryShallowCopy.setName("Library2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // when

        library.getBooks().add(new Book("Book5","Author5", LocalDate.of(2004,1,1)));

        int library1size = library.getBooks().size();
        int library2size = libraryShallowCopy.getBooks().size();

        // then

        Assert.assertEquals(library1size, library2size);


    }

    @Test
    public void Should_have_different_number_of_elements_after_add_When_deep_copy_is_used() {

        // given

        Library libraryDeepCopy = null;

        try {
            libraryDeepCopy = library.deepCopy();
            libraryDeepCopy.setName("Library3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // when

        library.getBooks().add(new Book("Book5","Author5", LocalDate.of(2004,1,1)));

        int library1size = library.getBooks().size();
        int library2size = libraryDeepCopy.getBooks().size() + 1;

        // then

        Assert.assertEquals(library1size, library2size);

    }
}
