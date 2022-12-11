package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListFiltering {

   public static List<Object> filterList(final List<Object> list) {
      // Return the List with the Strings filtered out
      return list.stream().filter(n -> n instanceof Integer).toList();
   }

   @Test
   void tests() {
      filterList(List.of(1, 2, "a", "b"));
   }

   @Test
   public void examples() {
      assertEquals(List.of(1, 2), filterList(List.of(1, 2, "a", "b")));
      assertEquals(List.of(1, 0, 15), filterList(List.of(1, "a", "b", 0, 15)));
      assertEquals(List.of(1, 2, 123), filterList(List.of(1, 2, "aasf", "1", "123", 123)));
   }

   @Test
   void testList() {
      List<Object> lists = List.of(1, 2, 3, 4, 5, "Z", "A", true);
      List<Integer> a = new ArrayList<>();

      for (Object list : lists) {
         if (list instanceof Integer)
            a.add((int) list);
      }

      // for (int i = 0; i < lists.size(); i++) {
      // if (lists.get(i) instanceof Integer)
      // lists.add(lists.get(i)); // error because lists immutable
      // lists.remove(i);
      // }

      System.out.println(lists);
      System.out.println(a);
   }

}
