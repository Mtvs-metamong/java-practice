package chapter04;

public class Application {
    public static void main(String[] args) {
        // 출력 결과 : "회원: Alice, ID: LM001, 대출 한도: 3;
        //            회원: Bob, ID: LM002, 대출 한도: 5"
        MemberManager memberManager = new MemberManager(new LibraryMember[] {
                LibraryMember.of("Alice", "LM001"),
                StudentMember.of("Bob", "LM002"),
        });

        System.out.println(memberManager.printMembers());

    }
}
