package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BoxFormulaTest {

   public static int[] getSize(int w, int h, int d) {
      int surfaceArea = 2 * ((w * h) + (w * d) + (h * d));
      int volume = w * h * d;
      return new int[] { surfaceArea, volume };
   }

   @Test
   void testName() {
      System.out.println(getSize(100, 100, 100));
   }

   @Test
   public void test1() {
      assertArrayEquals(new int[] { 88, 48 }, getSize(4, 2, 6));
      assertArrayEquals(new int[] { 6, 1 }, getSize(1, 1, 1));
      assertArrayEquals(new int[] { 10, 2 }, getSize(1, 2, 1));
      assertArrayEquals(new int[] { 16, 4 }, getSize(1, 2, 2));
      assertArrayEquals(new int[] { 600, 1000 }, getSize(10, 10, 10));
   }

}
