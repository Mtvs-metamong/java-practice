package chapter05.lesson;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements Manage {

        List<Book> booklist = new ArrayList<>();

        @Override
        public void addBook(Book book) {
            booklist.add(book);

        }

        @Override
        public void removeBook(String title) {

            booklist.remove(title);

        }

        // 전체 도서 목록을 문자열로 반환
        @Override
        public void listBooks() {
            String result = "";
            for(Book books : booklist) {
                result += "도서 : "+ books.getTitle() + ", " + books.getAuthor() + ", " + books.getPrice() + "; ";
            }
            System.out.println(result);

        }
//main() 메서드에서 샘플 데이터를 이용하여 기능을 시연
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        bookManager.addBook(new Book("Book 1", "John Doe", 100.0));
        bookManager.addBook(new Book("Book 2", "John Doe", 100.0));
        bookManager.listBooks();
    }
}
