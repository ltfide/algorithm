package hackerrank.medium;

import org.junit.jupiter.api.Test;

class Prime {

    void checkPrime(int... num) {
        for (int n : num) {
            if (isPrime(n)) {
                System.out.printf("%s ", n);
            }
        }
        System.out.println();
    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PrimeChecker {

    @Test
    void test() {
        int a1 = 2;
        int a2 = 1;
        int a3 = 3;
        int a4 = 4;
        int a5 = 5;

        Prime prime = new Prime();
        prime.checkPrime(a1);
        prime.checkPrime(a1, a2);
        prime.checkPrime(a1, a2, a3);
        prime.checkPrime(a1, a2, a3, a4, a5);
    }
}
