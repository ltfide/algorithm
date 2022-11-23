package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemoveExclamationMarksTest {

   public static String remove(String s, int n) {
      while (0 < n) {
         s = s.replaceFirst("!", "");
         n--;
      }
      return s;
   }

   @Test
   void testRemove() {
      System.out.println(remove("Hi!!", 2));
   }

   @Test
   public void fixedTests() {
      // assertEquals("expected", "actual");
      assertEquals("Hi", remove("Hi!", 1));
      assertEquals("Hi", remove("Hi!", 100));
      assertEquals("Hi!!", remove("Hi!!!", 1));
      assertEquals("Hi", remove("Hi!!!", 100));
      assertEquals("Hi", remove("!Hi", 1));
      assertEquals("Hi!", remove("!Hi!", 1));
      assertEquals("Hi", remove("!Hi!", 100));
      assertEquals("!!Hi !!hi!!! !hi", remove("!!!Hi !!hi!!! !hi", 1));
      assertEquals("Hi !!hi!!! !hi", remove("!!!Hi !!hi!!! !hi", 3));
      assertEquals("Hi hi!!! !hi", remove("!!!Hi !!hi!!! !hi", 5));
      assertEquals("Hi hi hi", remove("!!!Hi !!hi!!! !hi", 100));
   }

}
