package chapter04.mission;

import chapter04.mission.model.Book;

public class LibrarySearch {
    public static void main(String[] args) {

     Book[] searchables = new Book[]{
                new Book("Java Programming", "Author", 50.0),
                new Book("Effective Java", "Author", 70.0),
                new Book("Clean Code", "Author", 65.0),
        };

        String books = LibrarySearch.searchBooks(searchables, "Java");
        System.out.println(books);

    }

    public static String searchBooks(Book[] books, String keyword) {

        String result = "";

        for (Book book : books) {
            if (book.matches(keyword)) {

                result += (book.getTitle()) + ";";

            }
        }
        return result;
    }
}
