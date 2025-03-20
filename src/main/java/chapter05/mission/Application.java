package chapter05.mission;

public class Application {
    public static void main(String[] args) {
        RentalManager rentalManager = new RentalManager();

        // 샘플 데이터 생성
        Book book1 = new Book("Title1");
        Book book2 = new Book("Title2");
        Book book3 = new Book("Title3");

        // 회원 LM001의 대여 목록에 책 추가
        rentalManager.rentBook("LM001", book1);
        rentalManager.rentBook("LM001", book2);

        // 회원 LM002의 대여 목록에 책 추가
        rentalManager.rentBook("LM002", book3);

        // 각 회원의 대여 목록 출력
        System.out.println(rentalManager.getRentalList("LM001"));
        System.out.println(rentalManager.getRentalList("LM002"));
        System.out.println(rentalManager.getRentalList("LM003")); // 존재하지 않는 회원

        // 출력 예시에 맞춘 형식으로 직접 출력
        System.out.println("회원ID: LM001 -> 대여 도서: [" + book1 + "]; [" + book2 + "]");
    }
}