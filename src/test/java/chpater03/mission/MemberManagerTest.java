package chpater03.mission;

import chapter03.mission.LibraryMember;
import chapter03.mission.MemberManager;
import chapter03.mission.StudentMember;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberManagerTest {

    private MemberManager memberManager;
    private LibraryMember[] members;

    @BeforeEach
    public void setUp() {
        members = new LibraryMember[]{
                new LibraryMember("Alice", "LM001"),
                new StudentMember("Bob", "LM002")
        };

        memberManager = new MemberManager(members);
    }

    @Test
    public void processMembers() {
        String result = memberManager.processMembers();

        Assertions.assertTrue(result.contains("회원: Alice"));
        Assertions.assertTrue(result.contains("ID: LM001"));
        Assertions.assertTrue(result.contains("대출 한도: 3"));
    }

    @AfterEach
    public void tearDown() {
        members = null;
        memberManager = null;
    }
}
