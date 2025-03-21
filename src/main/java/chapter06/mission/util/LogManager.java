package chapter06.mission.util;


import chapter06.mission.model.Record;
import java.io.*;
import java.util.List;

public class LogManager {
    //    입력받은 거래 기록을 로그 파일(예: "transaction.log")에 추가(append) 모드로 저장
//대출/반납 기록 정보를 담은 record 객체 리스트
    public static void logTransaction(List<Record> records, String filePath){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for(Record record : records){
                writer.write(record.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("로그 파일 저장 중 오류 발생 : " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("transaction.log"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}