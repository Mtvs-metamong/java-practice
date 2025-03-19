package chapter05.mission;

import com.ohgiraffers.z_activity.lesson.Book;

public class Application {
    public static void main(String[] args) {

        RentalManager rentalManager = new RentalManager();

        rentalManager.rentBook("LM001", new Book("Clean Code", "Robert C. Martin", 45.0));
        rentalManager.rentBook("LM001", new Book("Clean Codes", "Robert C. Martin", 45.0));
        rentalManager.rentBook("LM002", new Book("Effective Java", "Joshua", 55.0));

        rentalManager.getRentalList("LM002");
    }
}
