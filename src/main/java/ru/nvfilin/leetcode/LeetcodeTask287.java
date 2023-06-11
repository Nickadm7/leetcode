package ru.nvfilin.leetcode;

import java.util.Arrays;

public class LeetcodeTask287 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 2, 2};
        int[] nums1 = new int[]{3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums));
        System.out.println(findDuplicate(nums1));
    }

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) return nums[i];
        }
        return nums[nums.length - 1];
    }
}

/*
287. Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
*/

