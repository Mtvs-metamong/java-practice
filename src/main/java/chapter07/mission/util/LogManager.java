package chapter07.mission.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public final class LogManager {
    public static void logTransaction(
            final String record,
            final String filePath
    ) {
        try(BufferedWriter writer = new BufferedWriter(
                new FileWriter(filePath, true))
        ) {
            writer.write(record);
            writer.flush();
            System.out.println(record);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

}
