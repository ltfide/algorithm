package codewars.delapankyu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class UsernameWithRegex {

   public static boolean validateUsr(String s) {
      boolean trueOrFalse = Pattern.matches("[^A-Z\\s]{4,16}", s);
      return trueOrFalse;
   }

   @Test
   void tests() {
      System.out.println(validateUsr("lutfi")); // true
      System.out.println(validateUsr("lutfi ")); // false
      System.out.println(validateUsr("lutfi 123")); // false
      System.out.println(validateUsr("lutfi _")); // false
   }

   @Test
   public void basicTests() {
      assertEquals(true, validateUsr("regex"));
      assertEquals(false, validateUsr("a"));
      assertEquals(false, validateUsr("Hass"));
      assertEquals(false, validateUsr("Hasd_12assssssasasasasasaasasasasas"));
      assertEquals(false, validateUsr(""));
      assertEquals(true, validateUsr("____"));
      assertEquals(false, validateUsr("012"));
      assertEquals(true, validateUsr("p1pp1"));
      assertEquals(false, validateUsr("asd43 34"));
      assertEquals(true, validateUsr("asd43_34"));
   }

}
