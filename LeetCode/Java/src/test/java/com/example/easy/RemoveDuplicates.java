package com.example.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class RemoveDuplicates {

    private int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                nums[index++] = nums[i];
                map.put(nums[i], nums[i]);
            }
        }
        return index;
    }

    @Test
    void test() {
        int[] sample1 = { 1, 2, 2 };
        assertEquals(2, removeDuplicates(sample1));

        int[] sample2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        assertEquals(5, removeDuplicates(sample2));

        int[] sample3 = { -3, -1, 0, 0, 0, 3, 3 };
        assertEquals(4, removeDuplicates(sample3));
    }
}
