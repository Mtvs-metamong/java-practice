package chapter02.mission;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        String result = application.processWeek(new int[]{1, 3, 5, 8});
        System.out.println(result);
    }

    public String processWeek(int[] input) {
        int i = 0;
        String week = "";
//        1. for문을 사용하여 배열의 각 요소를 순차적으로 처리한다.
        for (; i < input.length; i++) {

//        2. switch 문을 사용하여 각 숫자에 해당하는 요일을 문자열로 변환한다.
//        - 1: "Monday", 2: "Tuesday", 3: "Wednesday", 4: "Thursday", 5: "Friday", 6: "Saturday", 7: "Sunday"
//                - 1~7 이외의 숫자는 "Unknown"으로 처리한다.
            switch (input[i]) {
                case 1:
                    week += "Monday, ";
                    break;
                case 2:
                    week += "Tuesday, ";
                    break;
                case 3:
                    week += "Wednesday, ";
                    break;
                case 4:
                    week += "Thursday, ";
                    break;
                case 5:
                    week += "Friday, ";
                    break;
                case 6:
                    week += "Saturday, ";
                    break;
                case 7:
                    week += "Sunday, ";
                    break;
                default:
                    week += "Unknown, ";
            }
        }

//        3. 변환된 요일 문자열들을 콤마(,)로 구분하여 최종 결과 문자열을 생성한다.
        return week.substring(0, week.length() - 2);
    }
}
