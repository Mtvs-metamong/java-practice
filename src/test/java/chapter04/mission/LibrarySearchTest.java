package chapter04.mission;

import chapter04.mission.model.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibrarySearchTest {

    private Book[] books;
    private LibrarySearch librarySearch;

    @BeforeEach
    void setUp() {
        books = new Book[]{
                new Book("Java Programming", "Author1", 50.5),
                new Book("Effective Java", "Author2", 70.0),
                new Book("Clean Code", "Author3", 65.0)
        };
        librarySearch = new LibrarySearch("Test Book", "Test Author", 0.0);
    }

    @AfterEach
    void tearDown() {
        books = null;
        librarySearch = null;
    }

    @Test
    void testLibrarySearchWithMatchingKeyword() {
        String keyword = "Java";
        String result = LibrarySearch.LibrarySearch(books, keyword);

        assertTrue(result.contains("Java Programming"));
        assertTrue(result.contains("Effective Java"));
        assertFalse(result.contains("Clean Code"));
    }

    @Test
    void testLibrarySearchWithNonMatchingKeyword() {
        String keyword = "Python";
        String result = LibrarySearch.LibrarySearch(books, keyword);

        assertEquals("", result);
    }
}
