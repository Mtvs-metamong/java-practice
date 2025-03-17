package chapter04;

public record MemberManager(LibraryMember[] libraryMembers) {
    public String printMembers() {
        StringBuilder message = new StringBuilder();
        for (LibraryMember member : this.libraryMembers) {
            message.append(member.toString());
        }
        return message.toString();
    }
}
