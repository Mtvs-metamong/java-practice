package chapter05;

import chapter05.model.Book;
import chapter05.service.Searchable;

public class LibrarySearch {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Programming", "Author", 50000.0),
                new Book("Effective Java", "Author", 7000.0),
                new Book("Clean Code", "Author", 5000.0)
        };
        String keyword = "Java";
        System.out.println(searchBooks(books, keyword));
    }

    protected static String searchBooks(Book[] books, final String keyword
    ) {
        String message = "";
        for (Searchable book : books) {
            if(book.matches(keyword)) {
                message += book.toString() + ";\n";
            }
        }
        return message;
    }
}
