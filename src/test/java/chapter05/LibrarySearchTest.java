package chapter05;

import chapter05.model.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibrarySearchTest {
    private Book[] books;
    private String keyword;

    @BeforeEach
    void setUp() {
        books = new Book[]{
                new Book("Java Programming", "Author", 50000.0),
                new Book("Effective Java", "Author", 7000.0),
                new Book("Clean Code", "Author", 5000.0)
        };
        keyword = "Java";
    }

    @Test
    @DisplayName("키워드가 포함된 도서 정보 문자열을 출력한다.")
    void getIncludingKeyword() {
        String expected = """
                title='Java Programming', author='Author', price=50000.0;
                title='Effective Java', author='Author', price=7000.0;
                """;
        String actual = LibrarySearch.searchBooks(books, keyword);
        assertEquals(expected, actual);
        assertTrue(actual.contains(keyword));
    }

    @AfterEach
    void tearDown() {
        books = null;
        keyword = null;
    }
}