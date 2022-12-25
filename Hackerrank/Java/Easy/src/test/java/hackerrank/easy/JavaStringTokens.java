package hackerrank.easy;

import org.junit.jupiter.api.Test;

public class JavaStringTokens {
     
    public static void strSplit(String str) {
        String strValidated = str.trim();
        
        if (strValidated.isBlank()) {
            System.out.println(0);
        } else {
            String[] conv = str.trim().split("[ !,?._'@]+");

            System.out.println(conv.length);
            for (String s : conv) {
                System.out.println(s);
            }
        }
    }

    @Test
    void tests() {
        // strSplit("He is a very very good boy, isn't he?");
        // strSplit("           YES      leading spaces        are valid,    problemsetters are         evillllll");
        strSplit("a");
        strSplit("");
        strSplit("   ");
    }

    @Test
    void testTrim() {
        String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        System.out.println(s.trim());

        String[] e = "  ".trim().split("[ ]");
        System.out.println(e.length);
    }

    @Test
    void testSplit() {
        String ex = "He is a very very good boy, isn't he?";

        String[] exConv = ex.split("[ !,?._'@]+");

        for (String c : exConv) {
            System.out.println(c);
        }
    }

}
