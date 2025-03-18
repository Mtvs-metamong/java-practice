package chapter03.mission;

public class Application {
    public static void main(String[] args) {
        LibraryMember[] libraryMembers = new LibraryMember[]{
                new LibraryMember("김김김", "kkk"),
                new StudentMember("이이이","eee"),
                new StudentMember("임임임","aaa"),
        };
        MemberManager manager = new MemberManager();
        String result = manager.processMembers(libraryMembers);

        System.out.println(result);
    }
}
