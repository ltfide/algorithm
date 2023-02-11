package codewars.enamkyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplesOfThreeOrFive {

    public static int solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }

    @Test
    void tests() {
        System.out.println(solution(15));
    }

    @Test
    void testExample() {
        assertEquals(23, solution(10));
        assertEquals(45, solution(15));
    }

}
