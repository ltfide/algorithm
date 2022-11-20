import java.util.StringJoiner;

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
        System.out.println(doubleChar("1234!_ "));
    }

    public static String doubleChar(String s) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            builder.append(str);
            builder.append(str);
        }

        return builder.toString();
    }
}
