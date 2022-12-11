package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfNumbersZeroToN {

   public static String showSequence(int value) {
      String resp = "";
      int sum = 0;

      if (value < 0)
         return value + "<0";

      if (0 == value)
         return "0=0";

      while (0 <= value) {
         sum += value;
         resp = (value > 0) ? "+" + value + resp : value + resp + " = " + sum;
         value--;
      }
      return resp;
   }

   @Test
   void tests() {
      System.out.println(showSequence(6));
      System.out.println(showSequence(0));
      System.out.println(showSequence(-15));
   }

   @Test
   public void testBasic() {
      assertEquals("0+1+2+3+4+5+6 = 21", showSequence(6));
      assertEquals("-15<0", showSequence(-15));
      assertEquals("0=0", showSequence(0));
   }

}
