package chapter06.mission;

import org.junit.jupiter.api.*;

import chapter06.mission.model.Record;
import chapter06.mission.util.LogManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {
    List<Record> records = new ArrayList<>();
    private static Path recordFile;


    @BeforeAll
    static void setUp() throws IOException {
        recordFile = Files.createTempFile("test_records", ".txt");
    }

    @BeforeEach
    void createFile(){
        records.add(new Record("Test Record 1","2019-02-11"));
        records.add(new Record("Test Record 2","2019-02-12"));
    }

    @Test
    public void testlogTransaction() throws IOException {
        LogManager.logTransaction(records, recordFile.toString());
        List<String> lines = Files.readAllLines(recordFile);
        assertEquals(2, lines.size());
        assertTrue(lines.get(0).contains("Test Record 1"));
        assertTrue(lines.get(1).contains("Test Record 2"));
    }

    @Test
    public void testlogTransaction_InvalidPath() {
        List<Record> records = List.of(new Record("Test Record 1","2019-02-11"));
        assertDoesNotThrow(() -> {
            LogManager.logTransaction(records, "///invalid_path///records.txt");
        });
    }

    @AfterEach
    void tearDown() {
        records = null;
    }

    @AfterAll
    static void tearDownAll() throws IOException {
        Files.deleteIfExists(recordFile);
    }
}
