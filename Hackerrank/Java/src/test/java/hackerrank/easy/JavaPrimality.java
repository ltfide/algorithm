package hackerrank.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class JavaPrimality {

    public static boolean isPrime(int n) {
        System.out.println(n);
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

    public static List<Integer> getPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return primes;
    }

    @Test
    void tests() {
        System.out.println(isPrime(4));

        System.out.println(getPrimes(100));
        // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
        // 73, 79, 83, 89, 97]
    }

    @Test
    void testBigIntegerPrimeNumber() {
        String big = "6513516734600035718300327211250928237178281758494417357560086828416863929270451437126021949850746381";
        BigInteger bigInteger = new BigInteger(big);

        System.out.println(bigInteger.isProbablePrime(13));
    }

}
