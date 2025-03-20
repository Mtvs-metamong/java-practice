package chapter06.mission.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogManager {

    public static void logTransaction(String record, String filePath) {

           SimpleDateFormat time = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss ");
           Date now = new Date();

        // 입력받은 거래 기록을 로그 파일(예: "transaction.log")에 추가(append) 모드로 저장한다.
        // 파일 입출력 시 발생하는 IOException을 try-catch로 처리한다.
       try  (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {

                writer.append(time.format(now) + record);
                writer.newLine();
                writer.flush();

       } catch (IOException e) {
           System.err.println("오류 발생" + e.getMessage());
           e.printStackTrace();
       }
    }
}
