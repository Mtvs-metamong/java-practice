package chapter02.mission;

//<요구사항 명세화>
//**미션 2: DayOfWeekPrinter**
//        - **입력:** 정수 배열 (예: {1, 3, 5, 8})
//        - **처리:**
//        1. for문을 사용하여 배열의 각 요소를 순차적으로 처리한다.
//    2. switch 문을 사용하여 각 숫자에 해당하는 요일을 문자열로 변환한다.
//        - 1: "Monday", 2: "Tuesday", 3: "Wednesday", 4: "Thursday", 5: "Friday", 6: "Saturday", 7: "Sunday"
//
//        - 1~7 이외의 숫자는 "Unknown"으로 처리한다.
//        3. 변환된 요일 문자열들을 콤마(,)로 구분하여 최종 결과 문자열을 생성한다.
//        - **출력:** 요일 문자열들이 콤마로 구분된 결과 (예: "Monday, Wednesday, Friday, Unknown").
//
//<개발 순서>
//1. 입력 정수 배열을 매개변수로 받는 메소드를 정의한다.
//2. for문을 사용하여 배열의 각 요소를 순회한다.
//        3. switch 문을 사용하여 각 숫자에 해당하는 요일 문자열을 결정한다.
//        4. 결정된 요일 문자열을 콤마로 연결하여 결과 문자열을 생성 후 반환한다.
public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        int[] days = {1, 3, 5, 8};
        String result = application.DayOfWeekPrinter(days);
        System.out.println(result);
    }

    public String DayOfWeekPrinter(int[] days) {
        String str = "" ;
        for (int day : days) {
            str += getDayOfWeek(day);
        }

        return str ;
    }

    private String getDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday, ";

            case 2:
                return "Tuesday, ";
            case 3:
                return "Wednesday, ";
            case 4:
                return "Thursday, ";
            case 5:
                return "Friday, ";
            case 6:
                return "Saturday, ";
            case 7:
                return "Sunday, ";
            default:
                return "Unknown";
        }
    }
}
