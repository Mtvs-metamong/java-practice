
**미션 2: 대출/반납 기록을 로그 파일로 저장하는 기능 구현**
- **입력:**
    - 대출 또는 반납 거래 기록을 나타내는 문자열
- **기능:**
    1. 입력받은 거래 기록을 로그 파일(예: "transaction.log")에 추가(append) 모드로 저장한다.
    2. 파일 입출력 과정에서 발생할 수 있는 예외를 처리하며, 잘못된 파일 경로 등의 예외 상황에 대해 assertThrows를 이용한 테스트를 진행한다.
- **출력 예:**
    - "transaction.log" 파일에 대출/반납 기록이 추가되어 저장됨


**미션 2 (대출/반납 로그 파일 저장):**
1. `LogManager` 클래스를 정의하여:
    - `logTransaction(String record, String filePath)` 메서드 구현
    - 파일 입출력 시 발생하는 IOException을 try-catch로 처리한다.
2. main() 메서드에서 샘플 거래 기록을 이용하여 로그 파일 저장 기능을 시연한다.

## 내가 접근하는 방법
1. LogManger 클래스를 만든다
2. logTransaction(String record) 메서드를 만든다
3. record가 반납 또는 대출이면 transaction.log에 record와 시간을 적는다.
4. 메서드에서 입력받은 record (거래기록)을 로그파일에 저장한다.
   -  writer.write("작성 시간 : " + java.time.LocalDateTime.now())
5. 입력 FileWriter 시 발생하는 IOException을 throws와 try-catch로 처리한다.
6. 출력 FileReader 시 발생하는 IOException을 throws와 try-catch로 처리한다.
7. App에서 대출 또는 반납 을 입력하여 로그파일 저장기능을 본다.