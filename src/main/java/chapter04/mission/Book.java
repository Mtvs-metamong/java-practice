package chapter04.mission;

public class Book implements Searchable {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Book(String title, String author, double price) {


        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public String toString() {
        return "0";
    }
@Override
    public boolean matches(String keyword){
        if (title.contains(keyword)) { return true; }
        return false;
    };
}
