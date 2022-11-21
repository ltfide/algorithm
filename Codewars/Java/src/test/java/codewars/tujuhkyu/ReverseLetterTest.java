package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverseLetterTest {

   public static String reverseLetter(String str) {
      String nonAlphabet = str.replaceAll("[^a-zA-Z]", "");
      StringBuilder result = new StringBuilder();

      for (int i = nonAlphabet.length() - 1; i >= 0; i--) {
         result.append(nonAlphabet.charAt(i));
      }
      return String.valueOf(result);
   }

   @Test
   void testReverseLetter() {
      System.out.println(reverseLetter("ultr53o?n"));
   }

   @Test
   public void testSomething() {
      doTest("krishan", "nahsirk");
      doTest("ultr53o?n", "nortlu");
      doTest("ab23c", "cba");
      doTest("krish21an", "nahsirk");
   }

   private void doTest(final String str, final String expected) {
      assertEquals(expected, reverseLetter(str));
   }

}
