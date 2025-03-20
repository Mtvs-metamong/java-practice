package chapter05.mission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalManager {
    Map<String, List<Book>> bookMap = new HashMap<>();

    public void rentBook(String memberId, Book book) {

        if (bookMap.get(memberId)== null) {
            List<Book> memberBooks;
            memberBooks = new ArrayList<>();
            bookMap.put(memberId, memberBooks);
        }
        bookMap.get(memberId).add(book);
    }

    public String getRentalList(String memberId) {
        List<Book> memberBooks = bookMap.get(memberId);
        if (memberBooks == null || memberBooks.isEmpty()) {
            return memberId + "의 대여 목록이 없습니다.";
        }

        StringBuilder sb = new StringBuilder(memberId + "의 대여 목록:\n");
        for (Book book : memberBooks) {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }
}