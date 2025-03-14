package chapter01.mission;

public class Application {
    public static void main(String[] args) {
        String s = "Java is Fun";
        String result = Application.length(s);
        System.out.println(result);
    }

    public static String length(String s) {
//        1. 입력 문자열을 `split(" ")`으로 분할하여 단어 배열을 생성한다.
        String[] word = s.split(" ");

//        2. 배열의 인덱스 0, 1, 2의 단어를 변수에 직접 할당한다.
        String word0 = word[0];
        String word1 = word[1];
        String word2 = word[2];

//        3. 각 단어의 길이를 `length()` 메서드로 계산한다.
        int length1 = word0.length();
        int length2 = word1.length();
        int length3 = word2.length();

//        4. 세 단어의 길이의 합계를 계산한다.
        int result = length1 + length2 + length3;

        return "단어1: " + length1 + ", 단어2: " + length2 + ", 단어3: " + length3 + ", 총 길이: " + result;
    }
}
