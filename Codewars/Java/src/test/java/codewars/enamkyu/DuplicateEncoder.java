package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DuplicateEncoder {

   public static String encode(String word) {
      StringBuilder encode = new StringBuilder();

      for (int i = 0; i < word.length(); i++) {
         boolean isUnique = false;
         for (int j = 0; j < word.length(); j++) {
            int x = (int) word.toLowerCase().charAt(i);
            int y = (int) word.toLowerCase().charAt(j);
            if (x == y && j != i) {
               isUnique = true;
            }
         }
         encode.append(isUnique ? ")" : "(");
      }
      return encode.toString();
   }

   @Test
   void tests() {
      System.out.println(encode("din"));
      System.out.println(encode("(( @"));
      System.out.println(encode("recede"));
      System.out.println(encode("Success"));
   }

   @Test
   public void test() {
      assertEquals(")()())()(()()(", encode("Prespecialized"));
      assertEquals("()()()", encode("recede"));
      assertEquals("(((", encode("din"));
      assertEquals(")())())", encode("Success"));
      assertEquals("))((", encode("(( @"));
      assertEquals("))))())))", encode("   ()(   "));
   }

   @Test
   void testEqualsReference() {
      System.out.println('x' == 'y'); // false
   }

}
