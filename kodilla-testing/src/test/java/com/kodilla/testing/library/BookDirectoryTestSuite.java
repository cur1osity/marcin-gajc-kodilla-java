package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithConditionX("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }


    @Test
    public void testListBooksWithCondition0Books() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();

        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithConditionX("ZeroBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithConditionX("FourtyBooks");

        // Then
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionBelow20WithAnyString() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);

        // When
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithConditionX("Any Title");

        // Then
        assertEquals(15, theListOfBooks15.size());

    }


    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithConditionX("Any");

        // Then
        assertEquals(10, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void Should_Have0ElementsListSize_When_LibraryUserHave0Books() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("name","lastname","123");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(generateListOfNBooks(0));

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOfX(libraryUser);

        // Then
        assertEquals(0, theListOfBooks.size());
    }

    @Test
    public void Should_Have1ElementListSize_When_LibraryUserHave1Book() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("name","lastname","123");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(generateListOfNBooks(1));

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOfX(libraryUser);

        // Then
        assertEquals(1, theListOfBooks.size());
    }

    @Test
    public void Should_Have5ElementsListSize_When_LibraryUserHave5Books() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("name","lastname","123");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(generateListOfNBooks(5));

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOfX(libraryUser);

        // Then
        assertEquals(5, theListOfBooks.size());
    }
}