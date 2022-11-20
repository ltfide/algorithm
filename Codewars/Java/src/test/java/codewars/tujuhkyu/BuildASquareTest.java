package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BuildASquareTest {
   
   static String generateShape(int n) {
      String ax = "";
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            ax += "+";
         }
         ax += (n > i) ? "\n" : "";
      }
      return ax;
   }

   @Test
   void testBuildASquare() {
      System.out.println(generateShape(3));

      assertEquals("+++\n+++\n+++", generateShape(3));
      assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", generateShape(5));
      assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", generateShape(8));
   }

}
