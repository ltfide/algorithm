package codewars.tujuhkyu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindThePositionTest {

   public static String position(char alphabet) {
      int number = (int) alphabet;
      return "Position of alphabet: " + (number - 96);
   }

   @Test
   void testName() {
      System.out.println(position('a'));
      System.out.println(position('z'));
   }

   @Test
   public void basicTests() {
      assertEquals("Position of alphabet: 1", position('a'));
      assertEquals("Position of alphabet: 26", position('z'));
      assertEquals("Position of alphabet: 5", position('e'));
   }

}
