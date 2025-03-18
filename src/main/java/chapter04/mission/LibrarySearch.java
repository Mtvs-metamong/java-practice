package chapter04.mission;

import chapter04.mission.model.Book;
import chapter04.mission.service.Searchable;

public class LibrarySearch extends Book implements Searchable {
    public LibrarySearch(String title, String author, double price) {
        super(title, author, price);
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Programming", "Author", 50.5),
                new Book("Effective Java", "Author", 70.0),
                new Book("Clean Code", "Author", 65.0)
        };

        String keyword = "Java";
        String result = LibrarySearch(books, keyword);

        System.out.println("===== 검색 결과 =====");
        System.out.println(result);
    }
    public static String LibrarySearch(Book[] books, String keyword) {
        StringBuilder result = new StringBuilder();

        for (Book book : books) {
            if (book.matches(keyword)) {  // 각 책 객체의 matches() 호출
                result.append(book.toString()).append("\n");
            }
        }

        return result.toString().trim();
    }
}