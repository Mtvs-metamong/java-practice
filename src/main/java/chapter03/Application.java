package chapter03;

public class Application {
    public static void main(String[] args) {
        Member member = Member.of("박지은", 1);
        System.out.println(member.enroll(1));
    }
}
