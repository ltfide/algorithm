package hackerrank.easy;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

public class JavaExceptionHandlingTest {

    public static Long power(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("n or p should not be negative.");
        }

        if (a == 0 && b == 0) {
            throw new Exception("n and p should not be zero.");
        }
        Long result = (long) Math.pow(a, b);
        return result;
    }

    @Test
    void testPower() throws Exception {
        System.out.println(power(3,  5));
        System.out.println(power(-2,  -1));
        System.out.println(power(0,  0));
    }

    @Test
    void handleException() {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
