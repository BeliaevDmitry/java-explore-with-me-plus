package tools;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    public static final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    private TimeFormat() {
    }

    public static String toString(LocalDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern(PATTERN));
    }

    public static LocalDateTime parse(String dateTimeString) {
        return LocalDateTime.parse(dateTimeString, DateTimeFormatter.ofPattern(PATTERN));
    }
}