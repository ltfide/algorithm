package codewars.tujuhkyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsTest {

   static String reverseWords(String original) {
      if (original.isBlank()) {
         return original;
      }
      String reversed = new String("");
      String[] strArr = original.split(" ");

      for (int i = 0; i < strArr.length; i++) {
         String temp = "";
         for (int j = strArr[i].length()-1; j >= 0; j--) {
            temp += strArr[i].charAt(j); 
         }
         if (i != 0) {
            reversed += " " + temp;
         } else {
            reversed += temp;
         }

      }

      return reversed;
   }
   
   @Test
   void testReverseWords() {
      System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));
      System.out.println(reverseWords("   ").length());

      Assertions.assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", reverseWords("The quick brown fox jumps over the lazy dog."));
   }

}
