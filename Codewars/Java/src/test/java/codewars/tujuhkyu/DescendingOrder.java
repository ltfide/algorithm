package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DescendingOrder {

   public static int sortDesc(int num) {
      int[] val = new int[String.valueOf(num).length()];
      int x = 0;

      int index = 0;
      while (num > 0) {
         val[index] = num % 10;
         num = num / 10;
         index++;
      }

      int temp;
      for (int i = 1; i < val.length; i++) {
         for (int j = i; j > 0; j--) {
            if (val[j] > val[j - 1]) {
               temp = val[j];
               val[j] = val[j - 1];
               val[j - 1] = temp;
            }
         }
      }

      for (int y : val) {
         x = 10 * x + y;
      }
      return x;
   }

   @Test
   void tests() {
      System.out.println(sortDesc(42145)); // 54421
   }

   @Test
   public void test_01() {
      assertEquals(0, DescendingOrder.sortDesc(0));
      assertEquals(51, DescendingOrder.sortDesc(15));
      assertEquals(987654321, DescendingOrder.sortDesc(123456789));
   }

   @Test
   void splitInt() {
      // an integer number to break
      int number = 42145;
      // while loop executes until the condition become false
      while (number > 0) {
         int digit = number % 10;
         // prints space between the digits
         System.out.print(" ");
         // prints the digits
         System.out.print(digit); // 54214
         // dividing the number by 10
         number = number / 10;
         System.out.println(number);
      }
   }

}
