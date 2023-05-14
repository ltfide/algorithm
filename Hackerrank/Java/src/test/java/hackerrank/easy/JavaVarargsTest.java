package hackerrank.easy;

import org.junit.jupiter.api.Test;

public class JavaVarargsTest {

    public void add(int ...a) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                sb.append(a[i]);
            } else {
                sb.append(a[i] + "+");
            }
            sum += a[i];
        }
        sb.append("=" + sum);
        System.out.println(sb.toString());
    }

    @Test
    void testVarargs() {
        add(1, 2);
        add(1, 2, 3);
    }
}
