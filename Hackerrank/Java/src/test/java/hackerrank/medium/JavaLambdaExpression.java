package hackerrank.medium;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

interface PerformOperation {
    boolean check(int num);
}

class MyMath {

    public boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return (n) -> n % 2 == 1;
    }

    public PerformOperation isPrime() {
        return (n) -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return (n) -> {
            String p = String.valueOf(n);
            for (int i = 0; i < p.length() / 2; i++) {
                if (p.charAt(i) != p.charAt(p.length() - 1 - i))
                    return false;
            }
            return true;
        };
    }
}

public class JavaLambdaExpression {

    @Test
    void test() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_lambda_expression.txt"));
        sc.nextInt();

        MyMath mm = new MyMath();
        PerformOperation op;
        String rs = null;
        boolean ret = false;
        while (sc.hasNext()) {
            int ch = sc.nextInt();
            if (ch == 1) {
                op = mm.isOdd();
                ret = mm.checker(op, sc.nextInt());
                rs = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = mm.isPrime();
                ret = mm.checker(op, sc.nextInt());
                rs = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = mm.isPalindrome();
                ret = mm.checker(op, sc.nextInt());
                rs = (ret) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(rs);
        }
    }
}