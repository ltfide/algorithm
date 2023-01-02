package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArrayDiff {

   /**
    * arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2})
    * arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3})
    * arrayDiff(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 })
    */
   public static int[] arrayDiff(int[] a, int[] b) {
      List<Integer> result = new ArrayList<>();

      for (int i = 0; i < a.length; i++) {
         boolean flag = false;
         for (int j = 0; j < b.length; j++) {
            if (a[i] == b[j]) {
               flag = true;
               break;
            }
         }
         if (!flag)
            result.add(a[i]);
      }

      int[] c = new int[result.size()];
      for (int i = 0; i < result.size(); i++) {
         c[i] = result.get(i);
      }

      return c;
   }

   @Test
   void tests() {
      System.out.println(arrayDiff(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }));
      System.out.println(arrayDiff(new int[] { 1, 2, 2 }, new int[] { 2 }));
      System.out.println(arrayDiff(new int[] { 1, 2 }, new int[] { 1 }));
      System.out.println(arrayDiff(new int[] { 1, 2, 4, 5, 6, 10 }, new int[] { 5, 6, 10 }));
      System.out.println(arrayDiff(new int[] { 1, 2, 2 }, new int[] { 1 }));
   }

   @Test
   public void sampleTests() {
      assertArrayEquals(new int[] { 2 }, arrayDiff(new int[] { 1, 2 }, new int[] { 1 }));
      assertArrayEquals(new int[] { 2, 2 }, arrayDiff(new int[] { 1, 2, 2 }, new int[] { 1 }));
      assertArrayEquals(new int[] { 1 }, arrayDiff(new int[] { 1, 2, 2 }, new int[] { 2 }));
      assertArrayEquals(new int[] { 1, 2, 2 }, arrayDiff(new int[] { 1, 2, 2 }, new int[] {}));
      assertArrayEquals(new int[] {}, arrayDiff(new int[] {}, new int[] { 1, 2 }));
      assertArrayEquals(new int[] { 1, 2, 4 }, arrayDiff(new int[] { 1, 2, 4, 5, 6, 10 }, new int[] { 5, 6, 10 }));
   }

   @Test
   void testListRemove() {
      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.remove(list.indexOf(3));

      System.out.println(list.size());
   }

}
