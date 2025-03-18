package chapter01.mission;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
    @Test
    void length(){
        String expected = "Java is Fun";

        String answer = Application.length(expected);

        Assertions.assertEquals("단어1: 4, 단어2: 2, 단어3: 3, 총 길이: 9", answer);
    }
}