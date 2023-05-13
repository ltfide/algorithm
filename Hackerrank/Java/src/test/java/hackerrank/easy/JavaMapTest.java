package hackerrank.easy;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class JavaMapTest {

    @Test
    void findPhoneNumber() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_map.txt"));

        Map<String, Integer> phoneBook = new HashMap<>();
        int totalFind = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalFind; i++) {
            String name = sc.nextLine();
            Integer phoneNumber = sc.nextInt();
            phoneBook.put(name, phoneNumber);
            sc.nextLine();
        }

        while (sc.hasNext()) {
            String personName = sc.nextLine();
            if (phoneBook.containsKey(personName)) {
                System.out.println(personName + "=" + phoneBook.get(personName));
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
