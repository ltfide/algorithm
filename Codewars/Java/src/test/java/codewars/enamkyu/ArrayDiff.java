package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArrayDiff {

   public static int[] arrayDiff(int[] a, int[] b) {
      List<int[]> listOne = Arrays.asList(a);
      List<int[]> listTwo = Arrays.asList(b);

      List<int[]> differences = new ArrayList<>(listOne);

      for (int[] x : differences) {
         for (int y : x) {
            System.out.println(y);
         }
      }

      return null;
   }

   @Test
   void tests() {
      System.out.println(arrayDiff(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }));
   }

   @Test
   public void sampleTests() {
      assertArrayEquals(new int[] { 2 }, arrayDiff(new int[] { 1, 2 }, new int[] { 1 }));
      assertArrayEquals(new int[] { 2, 2 }, arrayDiff(new int[] { 1, 2, 2 }, new int[] { 1 }));
      assertArrayEquals(new int[] { 1 }, arrayDiff(new int[] { 1, 2, 2 }, new int[] { 2 }));
      assertArrayEquals(new int[] { 1, 2, 2 }, arrayDiff(new int[] { 1, 2, 2 }, new int[] {}));
      assertArrayEquals(new int[] {}, arrayDiff(new int[] {}, new int[] { 1, 2 }));
   }

}
