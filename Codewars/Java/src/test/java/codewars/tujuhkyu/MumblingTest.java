package codewars.tujuhkyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MumblingTest {

   public static String accum(String s) {
      String result = "";

      for (int i = 0; i < s.length(); i++) {
         String con = "";
         for (int j = -1; j < i; j++) {
            con += s.toLowerCase().charAt(i);
         }
         if (i < s.length() - 1)
            con += "-";
         result += con.toUpperCase().charAt(0) + con.substring(1);
      }
      return result;
   }

   @Test
   void testName() {
      System.out.println(accum("abcd"));
      System.out.println(accum("ZpglnRxqenU"));
   }

   private static void testing(String actual, String expected) {
      Assertions.assertEquals(expected, actual);
   }

   @Test
   public void test() {
      System.out.println("Fixed Tests accum");
      testing(accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
      testing(accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
      testing(accum("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
      testing(accum("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
      testing(accum("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
   }

}
