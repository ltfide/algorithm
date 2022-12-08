package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumberExpandedForm {

   public static String expandedForm(int num) {
      String[] a = String.valueOf(num).split("");
      StringBuilder result = new StringBuilder();

      for (int i = 0; i < a.length; i++) {
         String temp;
         if (Integer.valueOf(a[i]) > 0) {
            temp = a[i];
            for (int j = i; j < a.length - 1; j++) {
               temp += "0";
            }
            temp += (i != a.length - 1 && Integer.valueOf(a[a.length - 1]) > 0) ? " + " : "";
            result.append(temp);
         }
      }

      return result.toString();
   }

   public static String anotherWays(int num) {
      String outs = "";
      for (int i = 10; i < num; i *= 10) {
         int rem = num % i;
         outs = (rem > 0) ? " + " + rem + outs : outs;
         num -= rem;
      }
      outs = num + outs;

      return outs;
   }

   @Test
   void tests() {
      // int beta = (int) Math.floor(70304 / 1);
      // System.out.println(beta);
      System.out.println(expandedForm(900000));
      System.out.println(expandedForm(70304));
   }

   @Test
   public void testSomething() {
      assertEquals("10 + 2", expandedForm(12));
      assertEquals("40 + 2", expandedForm(42));
      assertEquals("70000 + 300 + 4", expandedForm(70304));
   }

   @Test
   void testAnother() {
      String a = "";
      int x = 3000;

      a += x + "x";
      System.out.println(a); // 3000x
      System.out.println(anotherWays(70304));
   }

}
