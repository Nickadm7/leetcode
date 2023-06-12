package ru.nvfilin.leetcode;

public class LeetcodeTask2427 {
    public int commonFactors(int a, int b) {
        int max = Math.min(a, b);
        int count = 0;
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}

/*
2427. Number of Common Factors

Given two positive integers a and b, return the number of common factors of a and b.

An integer x is a common factor of a and b if x divides both a and b.
*/
