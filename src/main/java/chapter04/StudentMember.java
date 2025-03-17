package chapter04;

public class StudentMember extends LibraryMember {
    private StudentMember(
        String name,
        String membershipId
    ) {
        super(name, membershipId);
    }

    public static StudentMember of(
            final String name,
            final String membershipId
    ) {
        return new StudentMember(name, membershipId);
    }

    @Override
    protected int getBorrowLimit() {
        return super.getBorrowLimit() + 2;
    }
}
