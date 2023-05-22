package hackerrank.medium;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class TagContentExtractor {

    @Test
    void test() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/tag_content_extractor.txt"));

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            Pattern pattern = Pattern.compile("<([^<>/]+)>([^<>]+)</(\\1)>");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println(matcher.group(2));
                while (matcher.find()) {
                    System.out.println(matcher.group(2));
                }
            } else {
                System.out.println("None");
            }
        }
        sc.close();
    }
}
