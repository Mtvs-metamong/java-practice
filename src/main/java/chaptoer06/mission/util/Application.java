package chaptoer06.mission.util;

import com.ohgiraffers.z_activity.mission.model.Loan;
import com.ohgiraffers.z_activity.mission.model.Return;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        System.out.println("대출 정보가 어떻게 되세요? ");
        // 대출 정보를 입력 받음
        List<Loan> loans = List.of(
                new Loan("clean code", "Robert C. Martin", 45.0),
                new Loan("Effective Java", "Joshua Bloch", 55.0)
        );

        LogManager.logTransaction1(loans, "transaction1.log");
        LogManager.logTransaction2("transaction1.log");


        List<Return> as = List.of(
                new Return("code", "Robert C. Martin", 45.0),
                new Return("Java", "Joshua Bloch", 55.0)
        );

        LogManager.logTransaction3(as,  "transaction2.log");
        LogManager.logTransaction4("transaction2.log");
    }


//    Ｓｃａｎｎｅｒ　ｓｃ　＝　ｎｅｗ　Ｓｃａｎｎｅｒ（）：／／　ＳＰＬＩＴ（＂，＂）　대출　，자바　　／／　
//    ｚｍｆｆｏｔｍ　대출　＝　ｎｅｗ　ｚｍｆｆｏｔｍ（）　；　　
//    ｚｍｆｆｏｔｍ　반납　＝　ｎｅｗ　ｚｍｆｆｏｔｍ（）　；
//    ｓｙｔｅｍ，　（　＂대풀＂：　　＋　대출．ｔｏｓｔｒｉｎｇ（））　　；　
//    반납．



}