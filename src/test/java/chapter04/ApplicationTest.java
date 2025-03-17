package chapter04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {
    private MemberManager memberManager;
    private LibraryMember[] members;

    @BeforeEach
    void setUp() {
        members = new LibraryMember[] {
                LibraryMember.of("Alice", "LM001"),
                StudentMember.of("Bob", "LM002"),
        };
        memberManager = new MemberManager(members);
    }
    
    @Test
    @DisplayName("회원 대출한도 계산 기능 문자열 반환하기")
    void test() {
        String actual = memberManager.printMembers();
        String extected = "회원 : Alice, ID : LM001, 대출한도 : 3; 회원 : Bob, ID : LM002, 대출한도 : 5; ";
        assertEquals(extected, actual);
    }

    @AfterEach
    void tearDown() {
        memberManager = null;
        members = null;
    }
}