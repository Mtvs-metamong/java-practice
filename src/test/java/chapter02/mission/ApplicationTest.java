package chapter02.mission;

import chpater02.mission.Application;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    void testProcessWeek() {
        Application application = new Application();
        int[] input = {1, 3, 5, 8};

        String value = application.processWeek(input);

        String result = "Monday, Wednesday, Friday, Unknown";
        Assertions.assertEquals(result, value);
    }
}