package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class SortedYesOrNoOrHow {

   public static String isSortedAndHow(int[] array) {
      boolean isSorted = true;
      boolean no = false;

      for (int i = 2; i < array.length; i++) {
         if ((array[i - 2] < array[i - 1] && array[i - 1] > array[i])
               || (array[i - 2] > array[i - 1] && array[i - 1] < array[i])) {
            no = true;
            break;
         }
      }

      if (no) {
         return "no";
      }

      for (int i = 1; i < array.length; i++) {
         if (array[i] < array[i - 1]) {
            isSorted = false;
            break;
         }
      }

      return isSorted ? "yes, ascending" : "yes, descending";
   }

   @Test
   void tests() {
      System.out.println(isSortedAndHow(new int[] { 1, 2 }));
      System.out.println(isSortedAndHow(new int[] { 15, 7, 3, -8 }));
      System.out.println(isSortedAndHow(new int[] { 4, 2, 30 }));
   }

   @Test
   public void test1() {
      int[] array = new int[] { 1, 2 };
      assertEquals("yes, ascending", isSortedAndHow(array));
   }

   @Test
   public void test2() {
      int[] array = new int[] { 15, 7, 3, -8 };
      assertEquals("yes, descending", isSortedAndHow(array));
   }

   @Test
   public void test3() {
      int[] array = new int[] { 4, 2, 30 };
      assertEquals("no", isSortedAndHow(array));
   }

   @Test
   void testAnotherWays() {
      int[] array = { 4, 2, 3 };
      boolean asc = IntStream.range(0, array.length - 1).allMatch(i -> array[i] <= array[i + 1]);
      boolean desc = IntStream.range(0, array.length - 1).allMatch(i -> array[i] >= array[i + 1]);
      System.out.println(asc);
      System.out.println(desc);
   }

}
