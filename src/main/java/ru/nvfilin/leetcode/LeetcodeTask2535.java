package ru.nvfilin.leetcode;

public class LeetcodeTask2535 {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int dSum = 0;
        for (int num : nums) {
            sum += num;
            while (num > 0) {
                dSum += num % 10;
                num /= 10;
            }
        }
        return sum - dSum;
    }
}

/*
2535. Difference Between Element Sum and Digit Sum of an Array

You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.
*/
