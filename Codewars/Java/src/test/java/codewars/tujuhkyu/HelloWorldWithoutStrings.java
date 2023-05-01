package codewars.tujuhkyu;

import org.junit.jupiter.api.Test;

public class HelloWorldWithoutStrings {

    public static String helloWorld() {
        char[] chars = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};
        return new String(chars);
    }

    @Test
    void test() {
        System.out.println(helloWorld());
    }
}
