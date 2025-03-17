package chapter04;

public class Application {

    public static void main(String[] args) {
        MemberManager memberManager = new MemberManager(new LibraryMember[]{new LibraryMember("Alice", "LM001"), new StudentMember("Bob", "LM002")});
        String result = memberManager.processMembers().substring(0, memberManager.processMembers().length() - 2);
        System.out.println(result);
    }
}
