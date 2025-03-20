package chaptoer06.Test;

import chapter06.Loan;
import chapter06.Return;
import chapter06.LogManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LogManagerTest {
    List<Loan> books = new ArrayList<>();
    List<Return> returns = new ArrayList<>();
    private static Path loanFile;
    private static Path returnsFile;

    @BeforeAll
    static void setUp() throws IOException {
        loanFile = Files.createTempFile("test_transaction1", ".txt");
        returnsFile = Files.createTempFile("test_transaction2", ".txt");
    }
    @BeforeEach
    void createFile(){
        books.add(new Loan("Test Book 1", "Author A", 30.0));
        books.add(new Loan("Test Book 2", "Author B", 40.0));
        returns.add(new Return("Test Member 1", "TM001",40.0));
        returns.add(new Return("Test Member 2", "TM002",55.0));
    }

    @Test
    public void testSaveBooksToFile() throws IOException {
        LogManager.logTransaction1(books, loanFile.toString());
        List<String> lines = Files.readAllLines(loanFile);
        assertEquals(2, lines.size());
        assertTrue(lines.get(0).contains("Test Book 1"));
        assertTrue(lines.get(1).contains("Test Book 2"));
    }

    @Test
    public void testSaveMembersToFile() throws IOException {
        LogManager.logTransaction3(returns, returnsFile.toString());
        List<String> lines = Files.readAllLines(returnsFile);
        assertEquals(2, lines.size());
        assertTrue(lines.get(0).contains("Test Member 1"));
        assertTrue(lines.get(1).contains("Test Member 2"));
    }
    @Test
    public void testSaveBooksToFile_InvalidPath() {
        // 잘못된 파일 경로를 지정하여 IOException 발생 여부 확인
        List<Loan> bs = List.of(new Loan("Invalid Path Book", "Author X", 20.0));
        assertDoesNotThrow(() -> {
            LogManager.logTransaction1(bs,
                    "transaction1.txt");
        });
    }
    @AfterEach
    void tearDown() {
        books = null;
        returns = null;
    }
    @AfterAll
    static void tearDownAll() throws IOException {
        Files.deleteIfExists(loanFile);
        Files.deleteIfExists(returnsFile);
    }

}
