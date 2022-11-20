package codewars.tujuhkyu;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class PeopleInTheBusTest {

   public static int countPassengers(ArrayList<int[]> stops) {
      // int into = 0;
      // int getof = 0;
      // for (var a : stops) {
      // into += a[0];
      // getof += a[1];
      // }
      // return into - getof;
      return stops.stream()
            .mapToInt(x -> x[0] - x[1])
            .sum();
   }

   @Test
   void testName() {
      ArrayList<int[]> list = new ArrayList<>();
      list.add(new int[] { 10, 0 });
      list.add(new int[] { 3, 5 });
      list.add(new int[] { 2, 5 });
      System.out.println(countPassengers(list));
   }

}
