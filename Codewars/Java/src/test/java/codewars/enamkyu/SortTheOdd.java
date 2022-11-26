package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SortTheOdd {

   public static int[] sortArray(int[] array) {
      ArrayList<Integer> temp = new ArrayList<>();

      for (int i = 0; i < array.length; i++) {
         if (array[i] % 2 == 1) {
            temp.add(array[i]);
         }
      }
      temp.sort((o1, o2) -> o1.compareTo(o2));
      for (int i = 0, s = 0; i < array.length; i++) {
         if (array[i] % 2 == 1) {
            array[i] = temp.get(s++);
         }
      }
      return array;
   }

   @Test
   void tests() {
      System.out.println(sortArray(new int[] { 5, 8, 6, 3, 4 })); // 3,8,6,5,4
      System.out.println(sortArray(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }));
   }

   @Test
   public void exampleTest() {
      assertArrayEquals(new int[] { 1, 3, 2, 8, 5, 4 }, sortArray(new int[] { 5, 3, 2, 8, 1, 4 }));
      assertArrayEquals(new int[] { 1, 3, 5, 8, 0 }, sortArray(new int[] { 5, 3, 1, 8, 0 }));
      assertArrayEquals(new int[] {}, sortArray(new int[] {}));
   }

   @Test
   void sorting() {
      int[] arr = { 45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8 };
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

      System.out.println(Arrays.toString(arr)); // [1, 6, 8, 12, 32, 39, 42, 44, 45, 69, 85, 89]
   }

   @Test
   void sortOddNumber() {
      int[] arr = { 5, 8, 6, 3, 4 };
      int[] temp = Arrays.stream(arr).filter(n -> n % 2 == 1).sorted().toArray();
      System.out.println(Arrays.toString(temp));
   }

}
