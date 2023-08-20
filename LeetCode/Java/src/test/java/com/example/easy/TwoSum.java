package com.example.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class TwoSum {

    /**
     * nums = [2, 7, 10], target = 9
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }

    @Test
    void test1() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        assertArrayEquals(new int[] { 0, 1 }, twoSum(nums, target));
    }

    @Test
    void test2() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        assertArrayEquals(new int[] { 1, 2 }, twoSum(nums, target));
    }

    @Test
    void test3() {
        int[] nums = { 3, 3 };
        int target = 6;
        assertArrayEquals(new int[] { 0, 1 }, twoSum(nums, target));
    }
}
