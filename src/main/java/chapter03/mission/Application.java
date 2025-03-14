package chapter03.mission;

public class Application {
    public static void main(String[] args) {

        Member member = new Member("김가은");
        member.setMonth(9);
        String result = member.enroll();
        System.out.println(result);
    }
}
