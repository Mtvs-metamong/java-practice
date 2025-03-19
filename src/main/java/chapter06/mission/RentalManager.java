package chapter06.mission;

import chapter06.lesson.Book;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class RentalManager {
    private final Map<String, List<Book>> memberRentals = new HashMap<>();

    public void rentBook(final String memberId, final Book book) {
        memberRentals.put(memberId, List.of(book));
    }

    public String getRentalList(String memberId) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Book>> entry : memberRentals.entrySet()) {
            if (entry.getKey().equals(memberId)) {
                sb.append("회원 ")
                        .append(" -> ")
                        .append(entry.getValue().toString())
                        .append("\n");
            }
        }
        return sb.toString();
    }
}
