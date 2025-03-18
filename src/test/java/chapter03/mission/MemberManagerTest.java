package chapter03.mission;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberManagerTest {

    private LibraryMember[] libraryMembers;
    private MemberManager manager;
    @BeforeEach
    void setUp() {
        libraryMembers = new LibraryMember[]{
                new LibraryMember("김김김", "kkk"),
                new StudentMember("이이이","eee"),
                new StudentMember("임임임","aaa"),
        };
        manager = new MemberManager();
    }

    @Test
    void processMembers() {
        String result = manager.processMembers(libraryMembers);
        Assertions.assertTrue(result.contains("회원: 김김김, ID: kkk, 대출 한도: 3"));
        Assertions.assertTrue(result.contains("회원: 이이이, ID: eee, 대출 한도: 5"));
        Assertions.assertTrue(result.contains("회원: 임임임, ID: aaa, 대출 한도: 5"));
    }

    @AfterEach
    void tearDown() {
        libraryMembers = null;
    }

}
