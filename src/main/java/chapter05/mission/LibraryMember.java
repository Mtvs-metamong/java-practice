package chapter05.mission;

public class LibraryMember {
    private String name;
    private String membershipid;

    public LibraryMember(String name, String membershipid) {
        this.name = name;
        this.membershipid = membershipid;
    }

    public String getName() {
        return name;
    }

    public String getMembershipid() {
        return membershipid;
    }

    @Override
    public String toString() {
        return "0";
    }
}
