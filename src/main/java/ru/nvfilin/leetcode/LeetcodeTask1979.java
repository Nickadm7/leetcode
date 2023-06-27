package ru.nvfilin.leetcode;

import java.util.Arrays;

public class LeetcodeTask1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        return findGCDTwoInt(min, max);
    }

    public int findGCDTwoInt(int min, int max) {
        int out = 1;
        int i = 2;
        while (i <= min) {
            if (max % i == 0 && min % i == 0)
                out = i;
            i++;
        }
        return out;
    }
}

/*
1979. Find Greatest Common Divisor of Array

Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
*/
