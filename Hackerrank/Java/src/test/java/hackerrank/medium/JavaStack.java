package hackerrank.medium;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.Stack;

import org.junit.jupiter.api.Test;

public class JavaStack {

    public boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (!stack.isEmpty() && isMatchingPair(stack.peek(), c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '{' && closing == '}') || (opening == '[' && closing == ']')
                || (opening == '(' && closing == ')');
    }

    @Test
    void test() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_stack.txt"));

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (isBalanced(str)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
