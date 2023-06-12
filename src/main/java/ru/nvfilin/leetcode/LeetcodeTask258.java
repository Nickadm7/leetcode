package ru.nvfilin.leetcode;

public class LeetcodeTask258 {
    public int addDigits(int num) {
        while (num > 9) {
            num = separateAndSum(num);
        }
        return num;
    }

    public int separateAndSum(int input) {
        int out = 0;
        while (input > 0) {
            out += input % 10;
            input /= 10;
        }
        return out;
    }
}

/*
258. Add Digits

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
*/
