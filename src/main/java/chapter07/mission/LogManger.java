package chapter07.mission;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

public class LogManger {

    public static void logTransaction(String record){

       if(Objects.equals(record, "대출") || Objects.equals(record, "반납")){


           if (record.equals("대출")){

               Scanner scanner = new Scanner(System.in);

               System.out.print("대출 할 도서명을 입력해주세요 : ");
               String message = scanner.nextLine();

               try(BufferedWriter writer = new BufferedWriter(new FileWriter("transaction.log" ,true))){
                   writer.write(record);
                   writer.newLine();
                   writer.write( "대출 시간 : " + LocalDateTime.now());
                   writer.newLine();
                   writer.write("대출도서 : " + message);
                   writer.newLine();
                   writer.flush();
                   System.out.println("대출 완료");

               }
               catch (IOException e){
                   System.out.println("대출 실패");
               }finally {
                   scanner.close();
               };
           } else {
               Scanner scanner2 = new Scanner(System.in);

               System.out.print("반납 할 도서명을 입력해주세요 : ");
               String message2 = scanner2.nextLine();

               try(BufferedWriter writer = new BufferedWriter(new FileWriter("transaction.log" ,true))){
                   writer.write(record);
                   writer.newLine();
                   writer.write( "반납 시간 : " + LocalDateTime.now()
                           .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                   writer.newLine();
                   writer.write("대출도서 : " + message2);
                   writer.newLine();
                   writer.flush();
                   System.out.println("반납 완료");

               }
               catch (IOException e){
                   System.out.println("반납 실패");
               }finally {
                   scanner2.close();
               };
           }
       }
       else {
           System.out.println("대출 or 반납만 가능합니다.");
       }
    }
}
