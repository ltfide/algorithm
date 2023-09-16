package com.example.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveElement {

    private int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    @Test
    void test() {
        int[] nums1 = { 3, 2, 2, 3 };
        int val1 = 3;
        assertEquals(2, removeElement(nums1, val1));

        int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val2 = 2;
        assertEquals(5, removeElement(nums2, val2));
    }
}