package chapter04.mission;

import chapter04.mission.model.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibrarySearchTest {

    private Book[] books;
    private String keyword;

    @BeforeEach
    void setUp() {
        keyword = "Java";

        books = new Book[]{
                new Book("Java Programming", "Author", 50.0),
                new Book("Effective Java", "Author", 70.0),
                new Book("Clean Code", "Author", 65.0),
        };
    }

    @Test
    void testSearchBooks() {

        String book = LibrarySearch.searchBooks(books, keyword);

        Assertions.assertEquals("Java Programming; Effective Java", book);
    }

    @AfterEach
    void tearDown() {
        books = null;
        keyword = null;

        System.out.println("테스트 종료");
    }
  
}