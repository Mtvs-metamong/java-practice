package chapter03.mission;

public class MemberManager {

    public String processMembers(LibraryMember[] libraryMembers) {
        StringBuilder result = new StringBuilder();

        for (LibraryMember member : libraryMembers) {
            String memberInfo = String.format("회원: %s, ID: %s, 대출 한도: %d",
                    member.getName(), member.getMembershipId(), (int) member.getBorrowLimit());
            if (result.length() > 0) {
                result.append("; ");
            }
            result.append(memberInfo);
        }

        return result.toString();
    }

}

