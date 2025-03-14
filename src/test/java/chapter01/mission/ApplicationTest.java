package chapter01.mission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    void length() {
        String result = Application.length("Java is Fun");

        Assertions.assertEquals("단어1: " + 4 + ", 단어2: " + 2 + ", 단어3: " + 3 + ", 총 길이: " + 9, result);
    }
}