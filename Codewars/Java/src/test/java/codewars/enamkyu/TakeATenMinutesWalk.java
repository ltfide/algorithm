package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TakeATenMinutesWalk {

    public static boolean isValid(char[] walk) {
        if (walk.length != 10)
            return false;

        int ns = 0, ew = 0;
        for (char c : walk) {
            switch (c) {
                case 'n':
                    ns++;
                    break;
                case 's':
                    ns--;
                    break;
                case 'w':
                    ew++;
                    break;
                case 'e':
                    ew--;
                    break;
            }
        }

        return ns == 0 && ew == 0;
    }

    @Test
    void tests() {
        System.out.println(isValid(new char[] { 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
        System.out.println(isValid(new char[] { 'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
    }

    @Test
    void Test() {
        assertEquals(true, isValid(new char[] { 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
        assertEquals(false, isValid(new char[] { 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e' }));
        assertEquals(false, isValid(new char[] { 'w' }));
        assertEquals(false, isValid(new char[] { 'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
    }

}
