package codewars.tujuhkyu;

import org.junit.jupiter.api.Test;

public class SumOfNumbersTest {

   public static int getSum(int a, int b) {
      if (a == b)
         return a;

      int result = 0;
      for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
         result = result + i;
      }
      return result;
   }

   @Test
   void testGetSum() {
      System.out.println(getSum(-1, 2));
      System.out.println(getSum(1, 2));
      System.out.println(getSum(0, 1));
      System.out.println(getSum(0, -1));
   }

}
