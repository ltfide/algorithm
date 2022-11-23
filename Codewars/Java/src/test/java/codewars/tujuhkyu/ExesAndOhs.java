package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExesAndOhs {

   public static boolean getXO(String str) {
      String strX = str.replaceAll("[^xX]", "");
      String strO = str.replaceAll("[^oO]", "");

      return strX.length() == strO.length();
   }

   @Test
   void testBefore() {
      System.out.println(getXO("xxxooo"));
   }

   @Test
   public void testSomething() {
      assertEquals(true, getXO("xxxooo"));
      assertEquals(true, getXO("xxxXooOo"));
      assertEquals(false, getXO("xxx23424esdsfvxXXOOooo"));
      assertEquals(false, getXO("xXxxoewrcoOoo"));
      assertEquals(false, getXO("XxxxooO"));
      assertEquals(true, getXO("zssddd"));
      assertEquals(false, getXO("Xxxxertr34"));
   }

}
