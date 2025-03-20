package chapter07.mission.util;

import chapter07.mission.model.LoanStatus;
import chapter07.mission.service.LibraryService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static chapter07.mission.util.LogManager.logTransaction;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("대출/반납 기록 로그 파일 입출력 과정을 검증한다.")
class LogManagerTest {
    private static final String FILE_PATH = "transaction.log";
    private static Path filePath;

    @BeforeAll
    static void setUp() {
        filePath = Path.of(FILE_PATH);
    }

    // TODO 입출력 과정에서 발생할 수 있는 예외 목록
    //  - 파일이 해당 경로에 존재하지 않는다. (FileNotFoundException)
    //  - 파일의 확장자가 .log가 아니다. (커스텀)
    //  - 네트워크 등의 이슈로 파일 저장에 실패했다.
    //  - 파일이 생성되지 않았다.
    @DisplayName("파일이 정상적으로 생성되었는지 확인한다.")
    @Test
    //void createRecordFileSuccess(@TempDir Path tempDir) throws IOException {
    void createRecordFileSuccess() {
        logTransaction(
                new LibraryService().readRecord(
                        "박지은",
                        "USER002",
                        LoanStatus.CHECK_IN
                ),
                FILE_PATH
        );

        assertTrue(Files.exists(filePath));
        //Assertions.assertAll -> 한번에 묶어서 테스트 진행
    }

    @DisplayName("파일 삭제 시 정상적으로 파일이 삭제된다.")
    @Test
    void deleteFileSuccess() {
        // 삭제 시 예외 발생하지 않으면 테스트 케이스가 성공한다.
        assertDoesNotThrow(() -> Files.deleteIfExists(filePath));
    }

    @AfterAll
    @DisplayName("생성한 파일의 존재 여부를 확인하고 파일을 삭제한다.")
    static void tearDownAll() throws IOException {
        Files.deleteIfExists(filePath);
    }

}