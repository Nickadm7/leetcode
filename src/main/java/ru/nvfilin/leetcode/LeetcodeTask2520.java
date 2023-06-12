package ru.nvfilin.leetcode;

public class LeetcodeTask2520 {
    public int countDigits(int num) {
        int count = 0;
        int input = num;
        while (num > 0) {
            if (input % (num % 10) == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}

/*
2520. Count the Digits That Divide a Number

Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.
*/
