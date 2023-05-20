package hackerrank.medium;

import org.junit.jupiter.api.Test;

public class CanYouAccess {

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }

    @Test
    void test() {
        int num = 8;

        Object o;
        o = new Inner().new Private();

        String r = ((Inner.Private) o).powerof2(num);
        System.out.println(num + " is " + r);
        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
    }
}
