package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BreakCamelCase {

   public static String camelCase(String input) {
      StringBuilder result = new StringBuilder();

      for (int i = 0; i < input.length(); i++) {
         String x = String.valueOf(input.charAt(i));
         if (x.equals(x.toUpperCase())) {
            result.append(" ");
            result.append(x);
         } else {
            result.append(x);
         }
      }
      return result.toString();
   }

   @Test
   void testBefore() {
      System.out.println(camelCase("camelCasing"));
   }

   @Test
   public void tests() {
      assertEquals("camel Casing", camelCase("camelCasing"));
      assertEquals("camel Casing Test", camelCase("camelCasingTest"));
      assertEquals("camelcasingtest", camelCase("camelcasingtest"));
   }

   @Test
   void testReplaceAll() {
      String input = "camelCasing";
      String output = input.replaceAll("([A-Z])", " $1");

      System.out.println(output);
   }

}
