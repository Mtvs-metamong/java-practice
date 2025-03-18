package chapter01.mission;

public class Application {
    public static String length(String inputs) {
//        2. 배열의 인덱스 0, 1, 2의 단어를 변수에 직접 할당한다.
        String[] input = inputs.split(" ");
        String word1 = input[0];
        String word2 = input[1];
        String word3 = input[2];
//        3. 각 단어의 길이를 `length()` 메서드로 계산한다.
        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

//        4. 세 단어의 길이의 합계를 계산한다.
        int totalLength = length1 + length2 + length3;
        String words = "단어1: " + length1 + ", 단어2: " + length2 + ", 단어3: " + length3 + ", 총 길이: " + totalLength;
//                - **출력:** "단어1: <길이1>, 단어2: <길이2>, 단어3: <길이3>, 총 길이: <합계>" 형태의 결과 문자열.
//                - **제약:** 반복문 없이, 변수, 데이터 타입, 연산자, 배열과 문자열 다루기 기술만 사용한다.
        return words;
    }
}
