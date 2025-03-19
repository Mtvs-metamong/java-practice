package chapter03.lesson;

public abstract class Book {
    private String title;
    private String author;
    private double price;

    public abstract double getFinalPrice();

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    } // 저장

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
      return author;
    };
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
