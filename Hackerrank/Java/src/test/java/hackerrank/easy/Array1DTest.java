package hackerrank.easy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class Array1DTest {

    public static void solution() throws NumberFormatException, IOException {
        InputStream input = new FileInputStream("sample.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int[] arr = new int[n];
        int index = 0;
        while (bufferedReader.ready()) {
            arr[index] = Integer.parseInt(bufferedReader.readLine().trim());
            index++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        bufferedReader.close();
    }

    @Test
    void tests() throws NumberFormatException, IOException {
        solution();
    }

}
