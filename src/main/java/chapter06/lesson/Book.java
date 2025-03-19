package chapter06.lesson;

import lombok.Getter;

@Getter
public class Book {
    private final String title;
    private final String author;
    private final double price;

    private Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static Book of(
            final String title,
            final String author,
            final double price
    ) {
        return new Book(title, author, price);
    }

    @Override
    public String toString() {
        return "도서: [" + this.title +
                "], [" + this.author +
                "], [" + this.price + "]";
    }
}


