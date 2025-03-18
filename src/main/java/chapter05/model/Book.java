package chapter05.model;

import chapter05.service.Searchable;

public record Book(String title, String author, double price) implements Searchable {
    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price;
    }

    @Override
    public boolean matches(String keyword) {
        return this.title.contains(keyword);
    }
}
