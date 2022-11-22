package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DisemvowelTrolls {

   public static String disemvowel(String str) {
      String value = str.replaceAll("[aiueoAIUEO]", "");
      System.out.println(value);
      return value;
   }

   @Test
   void testDisemvowel() {
      disemvowel("This website is for losers LOL!");
   }

   @Test
   public void FixedTests() {
      assertEquals("Ths wbst s fr lsrs LL!", disemvowel("This website is for losers LOL!"));
      assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", disemvowel(
            "No offense but,\nYour writing is among the worst I've ever read"));
      assertEquals("Wht r y,  cmmnst?", disemvowel("What are you, a communist?"));
   }

}
