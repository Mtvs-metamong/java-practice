package chapter06.lesson;

public class Application {
    public static void main(String[] args) {
        BookManager bookManager = BookManager.getInstance();
        bookManager.addBook(Book.of("CleanCode", "Robert C.Martin", 45.0));
        bookManager.addBook(Book.of("Effective Java2", "Joshua2", 55.0));
        bookManager.addBook(Book.of("Effective Java", "Joshua", 55.0));

        bookManager.removeBook("Effective Java2");

        System.out.println(bookManager.listBooks());
        //도서: [Title1], [Author1], [Price1]; 도서: [Title2], [Author2], [Price2]"

    }
}
