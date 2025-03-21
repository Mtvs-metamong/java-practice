package chapter06.mission;

import chapter06.mission.util.LogManager;
import chapter06.mission.model.Record;

import java.util.List;

public class Application {
    public static void main(String[] args) {
//        대출 정보를 담은 Record 객체 리스트
        List<Record> records = List.of(
                new Record("대출","2019-02-11"),
                new Record("반납","2019-02-12")
        );

        LogManager.logTransaction(records,"transaction.log");
    }
}