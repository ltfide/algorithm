package hackerrank.medium;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class DuplicateWordsRegex {

    @Test
    void test() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_regex_2.txt"));

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            Matcher m = p.matcher(input);

            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        sc.close();
    }

    @Test
    void whileTest() {
        int a = 5;

        while (a-- > 0) {
            System.out.println(a);

            // 4
            // 3
            // 2
            // 1
            // 0
        }
    }
}
