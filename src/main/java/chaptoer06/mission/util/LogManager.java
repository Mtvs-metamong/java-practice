package chaptoer06.mission.util;

import com.ohgiraffers.z_activity.mission.model.Loan;
import com.ohgiraffers.z_activity.mission.model.Return;

import java.io.*;
import java.util.List;

public class LogManager {

        public static void logTransaction1(List<Loan> loans, String filePath){
                try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))){
                    for(Loan loan : loans){
                        writer.write(loan.toString());
                        writer.newLine();
                    }

                } catch (IOException e) {
                    System.err.println("대출 정보 저장 중 오류 발생 : " + e.getMessage());
                }

        } // 대출 저장

        public static void logTransaction2( String filePath){
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("대출 기록 : " + line);

                }
            } catch (IOException e) {
                System.out.println("파일 읽기 실패: " + e.getMessage());

            }
        } // 대출 기록

    public static void logTransaction3(List<Return> as, String filePath){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))){
            for(Return a : as){
                writer.write(a.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            System.err.println("대출 정보 저장 중 오류 발생 : " + e.getMessage());
        }

    } // 반납 저장

    public static void logTransaction4(String filePath){
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(" 반납 기록 : " + line);

            }
        } catch (IOException e) {
            System.out.println("파일 읽기 실패: " + e.getMessage());

        }
    } // 반납 기록

}
