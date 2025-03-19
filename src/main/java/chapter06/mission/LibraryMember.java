package chapter06.mission;

public record LibraryMember(String name, String membershipId) {

    @Override
    public String toString() {
        return "회원ID: " + this.membershipId;
    }
}
