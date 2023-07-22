package hackerrank.medium;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class JavaDequeTest {

    public static int findMaxUniqueSubarrays(int[] nums, int k) {
        int maxUnique = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> uniqueSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove elements outside the current window from the front of the deque
            if (i >= k) {
                int removed = deque.removeFirst();
                if (!deque.contains(removed)) {
                    uniqueSet.remove(removed);
                }
            }

            // Add the current element to the back of the deque and uniqueSet
            deque.addLast(nums[i]);
            if (!uniqueSet.contains(nums[i])) {
                uniqueSet.add(nums[i]);
            }

            // Update the maximum count of unique numbers
            maxUnique = Math.max(maxUnique, uniqueSet.size());
        }

        return maxUnique;
    }

    @Test
    void test() throws IOException {
        Scanner sc = new Scanner(Path.of("sample/java_deque.txt"));

        int totalNumber = sc.nextInt();
        int sizeSubArr = sc.nextInt();
        int[] nums = new int[totalNumber];

        int index = 0;
        while (sc.hasNext()) {
            nums[index] = sc.nextInt();
            index++;
        }

        int result = findMaxUniqueSubarrays(nums, sizeSubArr);
        System.out.println(result);
    }

    @Test
    void testDeque() {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println(deque); // 1 2 3

        deque.addLast(5);
        System.out.println(deque); // 1 2 3 5

        deque.addFirst(4);
        System.out.println(deque); // 4 1 2 3 5

        deque.removeFirst();
        System.out.println(deque); // 1 2 3 5
    }
}
