package chapter04;

import lombok.Getter;

@Getter
public class LibraryMember {
    private final String name;
    private final String membershipId;

    private LibraryMember(
        String name,
        String membershipId
    ) {
        this.name = name;
        this.membershipId = membershipId;
    }

    public static LibraryMember of(
            final String name,
            final String membershipId
    ) {
        return new LibraryMember(name, membershipId);
    }

    protected int getBorrowLimit() {
       return 3;
    }

    @Override
    public String toString() {
        return "회원 : " + this.name +
                ", ID : " + this.membershipId +
                ", 대출한도 : " + this.getBorrowLimit() + "; ";
    }
}
