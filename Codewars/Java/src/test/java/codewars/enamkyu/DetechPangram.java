package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DetechPangram {

   public static boolean check(String sentence) {
      String pangram = sentence.toLowerCase();
      String alphabet = "abcdefghijklmnopqrstuvwxyz";

      int index = 0;
      while (index < alphabet.length()) {
         char character = alphabet.charAt(index);
         if (!pangram.contains(Character.toString(character)))
            return false;
         index++;
      }
      return true;
   }

   @Test
   void tests() {
      String pangram = "The quick brown fox jumps over the lazy dog.";
      System.out.println(check(pangram));
   }

   @Test
   void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      assertEquals(true, check(pangram1));
   }

   @Test
   void test2() {
      String pangram2 = "You shall not pass!";
      assertEquals(false, check(pangram2));
   }

   @Test
   void testCharToInt() {
      char a = 'z';
      int x = a;
      System.out.println(x);
   }

   @Test
   void splitStringUnique() {
      // String pangram = "the quick brown fox jumps over the lazy dog.";
      String pangram = "you shall not pass!";
      String alphabet = "abcdefghijklmnopqrstuvwxyz";

      for (int i = 0; i < alphabet.length(); i++) {
         if (!pangram.contains(String.valueOf(alphabet.charAt(i)))) {
            System.out.println("false");
            break;
         }
      }

      System.out.println(true);
   }

}
