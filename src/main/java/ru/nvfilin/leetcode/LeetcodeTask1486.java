package ru.nvfilin.leetcode;

public class LeetcodeTask1486 {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        int out = 0;
        for (int num : nums) {
            out ^= num;
        }
        return out;
    }
}

/*
1486. XOR Operation in an Array

You are given an integer n and an integer start.

Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.
*/
