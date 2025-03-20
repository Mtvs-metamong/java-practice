package chapter07.mission;

import chapter07.mission.model.LoanStatus;
import chapter07.mission.service.LibraryService;
import chapter07.mission.util.LogManager;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Application {
    private static final String FILE_PATH = "transaction.log";

    public static void main(String[] args) {
        String userName = "", userId = "";
        int chooseNumber = 0;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("이름을 입력하세요 : ");
            userName = scanner.nextLine();

            System.out.println("ID을 입력하세요 : ");
            userId = scanner.nextLine();

            System.out.println("""
                    대출 상태를 선택하세요.
                    1. 대출
                    2. 반납
                    """);
            chooseNumber = scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.err.println("Invalid input : " + e.getMessage());
        }

        LogManager.logTransaction(
                new LibraryService().readRecord(
                        userName,
                        userId,
                        LoanStatus.valueOf(chooseNumber)
                ),
                FILE_PATH
        );
    }
}
