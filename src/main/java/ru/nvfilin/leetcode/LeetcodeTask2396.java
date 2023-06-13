package ru.nvfilin.leetcode;

public class LeetcodeTask2396 {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i < n - 1; i++) {
            int subN = nBasedInI(n, i);
            if (!isPalindromic(subN))
                return false;
        }
        return true;
    }

    public int nBasedInI(int n, int base) {
        int multiply = 1;
        int out = 0;
        int remainder;

        while (n > 0) {
            remainder = n % base;
            out += multiply * remainder;
            n /= base;
            multiply *= 10;
        }
        return out;
    }

    public boolean isPalindromic(int n) {
        int num = 0;
        int copy = n;
        int remainder;

        while (n > 0) {
            remainder = n % 10;
            num = num * 10 + remainder;
            n /= 10;
        }
        return num == copy;
    }
}

/*
2396. Strictly Palindromic Number

An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive),
the string representation of the integer n in base b is palindromic.

Given an integer n, return true if n is strictly palindromic and false otherwise.

A string is palindromic if it reads the same forward and backward.
*/