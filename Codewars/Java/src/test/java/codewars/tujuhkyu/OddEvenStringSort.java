package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Lutfi Dendiansyah
 * @created 01/05/2023 10:52
 */
public class OddEvenStringSort {

    public static String sortMyString(String s) {
        String oddString = "";
        String evenString = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                oddString += s.charAt(i);
            } else {
                evenString += s.charAt(i);
            }
        }
        return evenString + " " + oddString;
    }

    @Test
    void test() {
        String s = "Codewars";
        System.out.println(sortMyString(s));
    }

    @Test
    public void testSomething() {
        assertEquals("Wleclgltihuebredrf ofsheesenasnegrof", sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
        assertEquals("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
        assertEquals("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
        assertEquals("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
        assertEquals("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
        assertEquals("SBEMTGYHC UDRAOLPI", sortMyString("SUBDERMATOGLYPHIC"));
    }
}
