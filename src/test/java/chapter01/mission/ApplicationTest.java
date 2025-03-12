package chapter01.mission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    @DisplayName("입력 문자의 단어별 길이와 총 길이 구하기") // 테스트의 목적을 기입합니다.
    void calculateWordLengthTest() {
        String expected = "단어1: 4, 단어2: 2, 단어3: 3, 총 길이: 9";
        String actual = Application.calculateWordLength("Java is Fun");
        Assertions.assertEquals(expected, actual);
    }
}