package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComplementaryDNA {

   public static String makeComplement(String dna) {
      StringBuilder str = new StringBuilder();

      for (char x : dna.toCharArray()) {
         switch (x) {
            case 'C':
               str.append("G");
               break;
            case 'A':
               str.append("T");
               break;
            case 'T':
               str.append("A");
               break;
            case 'G':
               str.append("C");
               break;
         }
      }
      return str.toString();
   }

   @Test
   void testDna() {
      System.out.println(makeComplement("CATA"));
   }

   @Test
   public void test01() {
      assertEquals("TTTT", makeComplement("AAAA"));
      assertEquals("TAACG", makeComplement("ATTGC"));
      assertEquals("CATA", makeComplement("GTAT"));
   }

}
