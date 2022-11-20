import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePin {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("0000"));
        System.out.println(validatePin("1111"));
        System.out.println(validatePin("123456"));
        System.out.println(validatePin("098765"));
        System.out.println(validatePin("000000"));
        System.out.println(validatePin("090909"));
    }

    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
