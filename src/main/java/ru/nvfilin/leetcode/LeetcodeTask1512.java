package ru.nvfilin.leetcode;

public class LeetcodeTask1512 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};
        int[] nums1 = new int[]{1, 1, 1, 1};
        int[] nums2 = new int[]{1, 2, 3};
        System.out.println(numIdenticalPairs(nums));
        System.out.println(numIdenticalPairs(nums1));
        System.out.println(numIdenticalPairs(nums2));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
}

/*
1512. Number of Good Pairs

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/
