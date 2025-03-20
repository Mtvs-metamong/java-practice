package chapter06.mission;

import chapter06.mission.util.LogManager;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String record = "";

        // 샘플 거래 기록을 이용하여 로그 파일 저장 기능을 시연한다.
        // 입력: 대출 또는 반납 거래 기록을 나타내는 문자열 -> if문으로 1 / 2 받아서 1이면 대출 + 책 이름, 2면 반납 + 책이름 ..
        System.out.println("대출: 1, 반납: 2를 입력해주세요.");
        String input = scanner.nextLine();

        int num = 0;

        try{
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("1 혹은 2를 입력해주세요.");
        }

        if (num == 1) {
            System.out.println("책 이름을 입력해주세요");
            String book = scanner.nextLine();
            record += "대출, 책 이름: " + book;
            LogManager.logTransaction(record, "transaction.log");

        } else if (num == 2) {
            System.out.println("책 이름을 입력해주세요");
            String book = scanner.nextLine();
            record += "반납, 책 이름: " + book;
            LogManager.logTransaction(record, "transaction.log");

        } else {
            System.out.println("대여 서비스를 종료합니다.");
        }
    }
}
