package chapter03.mission;

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

    // 기본 대출 한도(getBorrowLimit())는 3권을 반환한다.
    public String getBorrowLimit() {
        return "3";
    }
}