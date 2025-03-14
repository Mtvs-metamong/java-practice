package chapter02.mission;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                getToDays(
                        convertIntegerArray(input.nextLine())
                )
        );
    }

    public static String getToDays(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(getToDay(numbers[i]));
            if (i < numbers.length -1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static int[] convertIntegerArray(String input) {
        return Arrays.stream(
                input.replaceAll("[{}]", "")
                        .strip()
                        .split(","))
                .mapToInt(x -> Integer.parseInt(x.strip()))
                .toArray();
    }

    public static String getToDay(int number) {
        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };
    }
}
