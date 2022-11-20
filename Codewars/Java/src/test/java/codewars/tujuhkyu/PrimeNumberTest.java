package codewars.tujuhkyu;

import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

   public static void listOfPrime() {
      int bil;
      int awal = 1;
      int akhir = 50;

      for (int i = awal; i <= akhir; i++) {
         bil = 0;
         for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
               bil++;
            }
         }
         if (bil == 2) {
            System.out.print(i + " ");
         }
      }
   }

   @Test
   void testName() {
      listOfPrime();
   }

}
