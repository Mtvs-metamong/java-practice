package chapter04;

public class LibraryMember {

    private String name;
    private String membershipId;

    public LibraryMember(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
    }

    public String getName() {
        return name;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public int getBorrowLimit() {
        return 3 ;
    }
}
