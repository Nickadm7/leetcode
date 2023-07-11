package ru.nvfilin.leetcode;

import java.util.Arrays;

public class LeetcodeTask1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j += 2) {
                int[] buffer = Arrays.copyOfRange(arr, i, j);
                for (int value : buffer) {
                    sum += value;
                }
            }
        }
        return sum;
    }
}

/*
1588. Sum of All Odd Length Subarrays

Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.
*/
