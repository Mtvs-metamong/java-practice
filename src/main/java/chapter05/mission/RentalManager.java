package chapter05.mission;

import chapter05.lesson.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalManager {

    private Map<String, List<Book>> books = new HashMap<String, List<Book>>();

    public void rentBook(String memberId, Book book) {
        if (books.get(memberId) == null) {

            List<Book> bookList = new ArrayList<Book>();
            bookList.add(book);
            books.put(memberId, bookList);

        } else {

            books.get(memberId).add(book);
        }
    }

    public void getRentalList(String memberId) {
        List<Book> list = books.get(memberId);
        System.out.print("회원ID: " + memberId + " -> 대여 도서: ");

        String result = "";

        for (int i = 0; i < list.size(); i++) {
            result += list.get(i).getTitle() + "; ";
        }

        System.out.println(result);
    }
}
