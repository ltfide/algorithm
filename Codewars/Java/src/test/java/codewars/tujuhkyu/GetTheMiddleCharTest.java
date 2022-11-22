package codewars.tujuhkyu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GetTheMiddleCharTest {

   public static String getMiddle(String word) {
      int wordLength = word.length() / 2;
      System.out.println(wordLength);
      StringBuilder chr = new StringBuilder();

      if (word.length() % 2 == 0) {
         chr.append(word.charAt(wordLength - 1));
         chr.append(word.charAt(wordLength));
      } else {
         chr.append(word.charAt(wordLength));
      }
      return chr.toString();

   }

   @Test
   void getMiddle() {
      System.out.println(getMiddle("test")); // es
      System.out.println(getMiddle("middle"));
      System.out.println(getMiddle("testing")); // t
   }

   @Test
   public void evenTests() {
      assertEquals("es", getMiddle("test"));
      assertEquals("dd", getMiddle("middle"));
   }

   @Test
   public void oddTests() {
      assertEquals("t", getMiddle("testing"));
      assertEquals("A", getMiddle("A"));
   }

   @Test
   void testStringBuilder() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("A");
      stringBuilder.append("A");
      stringBuilder.append("A");
      System.out.println(stringBuilder.toString());

   }

}
