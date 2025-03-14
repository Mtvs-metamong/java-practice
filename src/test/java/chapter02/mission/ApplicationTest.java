package chapter02.mission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ApplicationTest {

    @Test
    @DisplayName("정수 배열 형태의 문자열을 입력받아 해당하는 정수의 날짜를 변환한 요일을 출력한다.")
    void getToDays() {
        String given = "{1, 3, 5, 8}";
        String expected = "Monday,Wednesday,Friday,Unknown";
        String actual =  Application.getToDays(
                Application.convertIntegerArray(given)
        );
        Assertions.assertEquals(expected, actual);
    }
}