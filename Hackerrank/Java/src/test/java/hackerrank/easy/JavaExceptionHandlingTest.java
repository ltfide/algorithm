package hackerrank.easy;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

public class JavaExceptionHandlingTest {

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
