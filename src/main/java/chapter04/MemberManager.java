package chapter04;

public class MemberManager {
    LibraryMember[] libraryMembers ;

    public MemberManager(LibraryMember[] libraryMembers) {
        this.libraryMembers = libraryMembers;
    }

    public String processMembers(){
        String answer = "" ;
        for (LibraryMember libraryMember : libraryMembers) {
            answer += "회원: " + libraryMember.getName()+ ", ID: " +libraryMember.getMembershipId()
                    + ", 대출 한도: " + libraryMember.getBorrowLimit() +"; ";
        }
        return answer ;
    }
}
