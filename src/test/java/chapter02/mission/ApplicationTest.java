package chapter02.mission;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
    @Test
    void testDayOfWeekPrinterInput() {
        Application application = new Application();
        int[] days = {1, 3, 5, 8};
        String value = application.DayOfWeekPrinter(days);

        String result = "Monday, Wednesday, Friday, Unknown";
        Assertions.assertEquals(result, value);
    }
}
