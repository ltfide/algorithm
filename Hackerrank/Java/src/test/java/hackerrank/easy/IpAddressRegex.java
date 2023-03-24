package hackerrank.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class IpAddressRegex {
    
    public static boolean isValidIp(String input) {
        String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";  
        // Regex for a digit from 0 to 255 and followed by a dot, repeat 4 times. this is the regex to validate an IP address.  
        String regex = zeroTo255 + "\\."+ zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255; 

        return Pattern.matches(regex, input);
    }

    @Test
    void tests() {
        System.out.println(isValidIp("192.158.1.38"));
        System.out.println(isValidIp("1.111.1.0"));
    }

    @Test
    void testCase() {
        assertTrue(isValidIp("000.12.12.034"));
        assertTrue(isValidIp("121.234.12.12"));
        assertTrue(isValidIp("23.45.12.56"));
        assertFalse(isValidIp("00.12.123.123123.123"));
        assertFalse(isValidIp("122.23"));
        assertFalse(isValidIp("Hello.IP"));
    }

}
