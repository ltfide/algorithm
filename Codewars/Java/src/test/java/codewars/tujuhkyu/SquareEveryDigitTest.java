package codewars.tujuhkyu;

import org.junit.jupiter.api.Test;

public class SquareEveryDigitTest {

   public static int squareDigits(int n) {
      String value = String.valueOf(n);
      String result = "";

      for (int i = 0; i < value.length(); i++) {
         byte x = Byte.valueOf(String.valueOf(value.charAt(i)));
         int pow = (int) Math.pow(x, 2);
         result += String.valueOf(pow);
      }
      return Integer.valueOf(result);
   }

   @Test
   void testSquareDigits() {
      System.out.println(squareDigits(9119));
      System.out.println(squareDigits(0));
   }

   @Test
   void testChartAt() {
      System.out.println(9 * 9);
      System.out.println("abc".charAt(0));
   }

}
