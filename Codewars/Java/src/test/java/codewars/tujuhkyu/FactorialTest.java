package codewars.tujuhkyu;

import org.junit.jupiter.api.Test;

public class FactorialTest {

   public static int factorial(int n) {
      if (n < 0 || n > 12) {
         throw new IllegalArgumentException();
      }
      if (n <= 0)
         return 1;
      return n * factorial(n - 1);
   }

   @Test
   void testName() {
      System.out.println(factorial(5));
      System.out.println(factorial(0));
   }

}
