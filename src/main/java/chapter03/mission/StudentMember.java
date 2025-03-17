package chapter03.mission;

public class StudentMember extends LibraryMember {

    public StudentMember(String name, String membershipId) {
        super(name, membershipId);
    }

    @Override
    public String getBorrowLimit() {
        return "5";
    }
}
