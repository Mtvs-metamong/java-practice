package chapter06.mission;

import chapter06.lesson.Book;

public class Application {
    public static void main(String[] args) {
        LibraryMember libraryMember = new LibraryMember("박지은", "LM001");
        RentalManager rentalManager = new RentalManager();
        rentalManager.rentBook("LM001", Book.of("CleanCode", "Robert C.Martin", 45.0));

        String rentalByMember = rentalManager.getRentalList("LM001");
        System.out.println(rentalByMember);

    }
}
