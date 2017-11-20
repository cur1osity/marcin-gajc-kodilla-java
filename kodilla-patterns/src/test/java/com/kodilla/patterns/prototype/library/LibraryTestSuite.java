package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {

    private Library library;
    private Book book;

    private Set<Book> createBooks() {

        Set<Book> books = new HashSet<>();

        books.add(new Book("Book1", "Author1", LocalDate.of(2000, 1, 1)));
        books.add(new Book("Book2", "Author2", LocalDate.of(2001, 1, 1)));
        books.add(new Book("Book3", "Author3", LocalDate.of(2002, 1, 1)));
        books.add(new Book("Book4", "Author4", LocalDate.of(2003, 1, 1)));
        books.add(new Book("Book5", "Author5", LocalDate.of(2004, 1, 1)));

        return books;
    }

    @Before
    public void librarySetup() {

        library = new Library("Library1");

        library.getBooks().addAll(createBooks());

        book = new Book("Book6", "Auhor6", LocalDate.of(2004, 1, 1));
    }

    @Test
    public void Should_HaveSameNumberOfElementsAfterAdd_When_ShallowCopyIsUsed() throws Exception {

        // given
        //@Before

        // when
        Library libraryShallowCopy = library.shallowCopy();
        library.addBook(book);

        // then
        int library1size = library.getBooks().size();
        int library2size = libraryShallowCopy.getBooks().size();
        Assert.assertEquals(library1size, library2size);
    }

    @Test
    public void Should_HaveDifferentNumberOfElementsAfterAdd_WhenDeepCopyIsUsed() throws Exception {

        // given
        //@Before

        // when
        Library libraryDeepCopy = library.deepCopy();
        library.addBook(book);

        // then
        int library1size = library.getBooks().size();
        int library2size = libraryDeepCopy.getBooks().size();
        Assert.assertEquals(6, library1size);
        Assert.assertEquals(5, library2size);
    }


    @Test
    public void Should_HaveDifferentName_WhenShallowCopyIsUsed() throws Exception {

        // given
        //@Before

        // when
        Library libraryShallowCopy = library.shallowCopy();
        library.setName("LibraryX");

        // then
        Assert.assertNotEquals(library.getName(), libraryShallowCopy.getName());
    }

    @Test
    public void Should_HaveDifferentName_WhenDeepCopyIsUsed() throws Exception {

        // given
        //@Before

        // when
        Library libraryDeepCopy = library.deepCopy();
        library.setName("LibraryX");

        // then
        Assert.assertNotEquals(library.getName(), libraryDeepCopy.getName());

    }
}

