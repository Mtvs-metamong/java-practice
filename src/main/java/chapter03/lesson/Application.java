package chapter03.lesson;

public class Application {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new PrintedBook("자바 프로그래밍","author A", 50.0,5000),
                new Ebook("자바 입문", "Author B ", 70.00,0.1),
                new PrintedBook("clean code","author C ", 65.0,5000),
        };

        BookinvantoryCalculator calculator = new BookinvantoryCalculator(books);
        System.out.println(calculator.calculateInvantory());
    }
}
