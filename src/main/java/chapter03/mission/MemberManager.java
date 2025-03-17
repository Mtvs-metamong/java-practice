package chapter03.mission;

public class MemberManager {

    private LibraryMember[] members;

    public MemberManager(LibraryMember[] members) {
        this.members = members;
    }

    public String processMembers() {

        String result = "";

        int len = members.length;
        for (int i = 0; i < len; i++) {
            result += "회원: " + members[i].getName() + ", ID: " + members[i].getMembershipId()
                    + ", 대출 한도: " + members[i].getBorrowLimit() + "; ";
        }

        return result.substring(0, result.length() - 2);
    }
}
