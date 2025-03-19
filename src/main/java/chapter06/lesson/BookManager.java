package chapter06.lesson;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class BookManager {
    private final List<Book> books = new ArrayList<>();

    public static BookManager getInstance() {
        return new BookManager();
    }

    public void addBook(final Book book) {
        books.add(book);
    }

    public boolean removeBook(final String title) {
        return books.removeIf(book -> book.getTitle().contains(title));
    }

    public String listBooks() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < books.size(); i++) {
            stringBuilder.append(books.get(i).toString());
            if (i == books.size() - 1)
                break;

            stringBuilder.append("; ");
        }
        return stringBuilder.toString();
    }
}
