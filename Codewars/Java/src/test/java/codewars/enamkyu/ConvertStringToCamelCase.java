package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConvertStringToCamelCase {

    public static String toCamelCase(String s) {
        String[] x = s.split("[_,-]"); // [the, stealth, warrior]
        s = x[0]; // the

        for (int i = 1; i < x.length; i++) {
            s += x[i].toUpperCase().charAt(0) + x[i].substring(1).toLowerCase();
        }
        return s;
    }

    @Test
    void tests() {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("the_stealth_warrior"));
    }

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        assertEquals("theStealthWarrior", toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        assertEquals("theStealthWarrior", toCamelCase(input));
    }
}
