package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class CorrectTimeString {

    public static String timeCorrect(String timeString) {
        if (timeString == null || !Pattern.matches("([0-9]){2}:([0-9]){2}:([0-9]){2}", timeString))
            return null;

        String[] timeX = timeString.split(":");

        int hour = Integer.parseInt(timeX[0]);
        int minute = Integer.parseInt(timeX[1]);
        int second = Integer.parseInt(timeX[2]);

        if (second / 60 > 0) {
            minute += 1 * (second / 60);
            second -= 60 * (second / 60);
        }

        if (minute / 60 > 0) {
            hour += 1 * (minute / 60);
            minute -= 60 * (minute / 60);
        }

        hour = hour % 24;

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    @Test
    void tests() {
        System.out.println(timeCorrect("19:99:99"));
    }

    @Test
    public void testNull() {
        assertNull(timeCorrect(null));
    }

    @Test
    public void testCorrect() {
        Arrays.asList("09:10:01", "00:00:00", "23:59:59", "12:34:56")
                .forEach(s -> assertEquals(s, s));
    }

    @Test
    public void testCorrection() {
        assertEquals("12:10:10", timeCorrect("11:70:10"));
        assertEquals("20:39:09", timeCorrect("19:99:09"));
        assertEquals("20:40:39", timeCorrect("19:99:99"));
        assertEquals("00:01:01", timeCorrect("24:01:01"));
        assertEquals("04:01:01", timeCorrect("52:01:01"));
    }

    @Test
    public void testInvalidFormat() {
        assertEquals(null, timeCorrect("0:00:00"));
        assertEquals(null, timeCorrect("00:0:00"));
        assertEquals(null, timeCorrect("00:00:0"));
        assertEquals(null, timeCorrect("-0:00:00"));
        assertEquals(null, timeCorrect("00:00:000"));
        assertEquals(null, timeCorrect("000000"));
        assertEquals(null, timeCorrect("00;11;22"));
        assertEquals(null, timeCorrect("00:00:0/"));
        assertEquals(null, timeCorrect(":0:00:00"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals("00:00:00", timeCorrect("24:00:00"));
        assertEquals("00:00:00", timeCorrect("23:59:60"));
        assertEquals("00:00:00", timeCorrect("47:59:60"));
        assertEquals("00:00:59", timeCorrect("47:60:59"));
        assertEquals("12:00:00", timeCorrect("12:00:00"));
        assertEquals("04:40:39", timeCorrect("99:99:99"));
        assertEquals("01:00:00", timeCorrect("24:60:00"));
        assertEquals("01:00:00", timeCorrect("25:00:00"));
    }

}
