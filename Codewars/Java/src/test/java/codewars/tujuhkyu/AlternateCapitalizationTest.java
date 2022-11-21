package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlternateCapitalizationTest {

   public static String[] capitalize(String s) {
      String even = "";
      String odd = "";

      for (int i = 0; i < s.length(); i++) {
         if (i % 2 == 0) {
            even += s.toUpperCase().charAt(i);
            odd += s.charAt(i);
         } else {
            odd += s.toUpperCase().charAt(i);
            even += s.charAt(i);
         }
      }
      return new String[] { even, odd };
   }

   @Test
   void testName() {
      // System.out.println(capitalize("abcdef"));

      System.out.println(capitalize("codewarriors"));
   }

   @Test
   public void basicTests() {
      assertArrayEquals(new String[] { "AbCdEf", "aBcDeF" }, capitalize("abcdef"));
      assertArrayEquals(new String[] { "CoDeWaRs", "cOdEwArS" }, capitalize("codewars"));
      assertArrayEquals(new String[] { "AbRaCaDaBrA", "aBrAcAdAbRa" }, capitalize("abracadabra"));
      assertArrayEquals(new String[] { "CoDeWaRrIoRs", "cOdEwArRiOrS" }, capitalize("codewarriors"));
   }

}
