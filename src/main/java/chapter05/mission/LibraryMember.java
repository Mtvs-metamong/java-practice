package chapter05.mission;

public class LibraryMember {
    private String name;
    private int membershipid;

    public LibraryMember(String name, int membershipid) {
        this.name = name;
        this.membershipid = membershipid;
    }

    public String getName() {
        return name;
    }

    public int getMembershipid() {
        return membershipid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembershipid(int membershipid) {
        this.membershipid = membershipid;
    }

    @Override
    public String toString() {
        return "회원ID: [name=" + name + ", membershipid=" + membershipid + "]";
    }
}
