package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * URL
 * https://www.codewars.com/kata/58b1ae711fcffa34090000ea
 */
public class KillerGarageDoor {

    public static String run(String input) {
        String output = "";

        int post = 0;
        boolean opening = true;
        boolean moving = false;
        // p.p.. -> 122222
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'P') {
                moving = !moving;
            } else if (c == 'O') {
                opening = !opening;
            }

            if (moving && opening) {
                post += 1;
            } else if (moving && !opening) {
                post -= 1;
            }

            if ((moving && post == 0) || (moving && post == 5)) {
                moving = !moving;
                opening = !opening;
            }

            output += post;
        }

        return output;
    }

    @Test
    void tests() {
        System.out.println(run("P.O...."));
        System.out.println(run("P.P.."));
        System.out.println(run("..P...O....."));
        System.out.println(run("P.P....P...O.."));
        System.out.println(run("POP...P.PP..PO..P.O.P..PO.P...OO.P.OO..PP..P.P...OOPPP...O.PO...OPP"));

    }

    @Test
    public void testNormalOperation() {
        test("should stay closed unless button is pressed (no buttonpresses)", "..........", "0000000000");
        test("should start opening on buttonpress", "P..", "123");
        test("should open completely and stay open", "P....", "12345");
    }

    @Test
    public void testPause() {
        test("should start opening and pause on second buttonpress", "P.P..", "12222");
    }

    @Test
    public void testObstacles() {
        test("should reverse while opening", "P.O....", "1210000");
    }

    @Test
    public void testExample() {
        test("should start opening and reverse when obstacle", "..P...O.....", "001234321000");
    }

    private void test(String description, String events, String result) {
        assertEquals(result, run(events));
    }

    @Test
    void anotherTest() {
        String input = "P.P..";
        String output = "";

        int position = 0;
        int direction = 0; // 0 = closed, 1 = opening, -1 = closing
        boolean pause = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'P') {
                if (direction == 0) {
                    direction = 1;
                } else if (direction == 1 || direction == -1) {
                    pause = true;
                }
            } else if (c == 'O') {
                direction *= -1;
            }

            if (!pause) {
                position += direction;
            }

            if (position < 0) {
                position = 0;
                direction = 0;
            } else if (position > 5) {
                position = 5;
                direction = 0;
            }
            output += position;
        }
        System.out.println(output);
    }

}
