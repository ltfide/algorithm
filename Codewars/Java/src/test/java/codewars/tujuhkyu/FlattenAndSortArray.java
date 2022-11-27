package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FlattenAndSortArray {

   public static int[] flattenAndSort(int[][] array) {
      int[] arr = new int[0];

      for (int i = 0, index = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++) {
            int[] temp = arr;
            arr = new int[arr.length + 1];

            for (int s = 0; s < temp.length; s++) {
               arr[s] = temp[s];
            }
            arr[index++] = array[i][j];
         }
      }

      int temp;
      for (int i = 1; i < arr.length; i++) {
         for (int j = i; j > 0; j--) {
            if (arr[j] < arr[j - 1]) {
               temp = arr[j];
               arr[j] = arr[j - 1];
               arr[j - 1] = temp;
            }
         }
      }
      return arr;
   }

   @Test
   void tests() {
      System.out.println(flattenAndSort(new int[][] { { 3, 2, 1 }, { 4, 6, 5 } }));
      // System.out.println(flattenAndSort(new int[][] { { 3, 2, 1 }, { 4, 6, 5 }, {},
      // { 9, 7, 8 } })); // [1, 2, 3, 4, 5,
      // 6, 7, 8, 9].
   }

   @Test
   public void exampleTest() {
      assertArrayEquals(new int[] {}, flattenAndSort(new int[][] {}));
      assertArrayEquals(new int[] { 1 }, flattenAndSort(new int[][] { {}, { 1 } }));
      assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
            flattenAndSort(new int[][] { { 3, 2, 1 }, { 7, 9, 8 }, { 6, 4, 5 } }));
      assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 100 },
            flattenAndSort(new int[][] { { 1, 3, 5 }, { 100 }, { 2, 4, 6 } }));
      assertArrayEquals(new int[] { 111, 222, 333, 444, 555, 666, 777, 888, 999 }, flattenAndSort(
            new int[][] { { 111, 999 }, { 222 }, { 333 }, { 444 }, { 888 }, { 777 }, { 666 }, { 555 } }));
   }

}
