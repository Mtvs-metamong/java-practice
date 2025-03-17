package chapter04;

public class StudentMember extends LibraryMember {
    public StudentMember(String name, String membershipId) {
        super(name, membershipId);
    }

    @Override
    public int getBorrowLimit() {
        return 5 ;
    }
}
