package hackerrank.easy;

import org.junit.jupiter.api.Test;

public class JavaInterfaceTest {

    public interface AdvancedArithmetic {
        public int divisor_sum(int n);
    }

    private class MyCalculator implements AdvancedArithmetic {

        @Override
        public int divisor_sum(int n) {
            System.out.println("I implemented: AdvancedArithmetic");
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    sum += i;
            }
            return sum;
        }

    }

    @Test
    void testMyCalculator() {
        MyCalculator mc = new MyCalculator();
        System.out.println(mc.divisor_sum(6));
    }
}
