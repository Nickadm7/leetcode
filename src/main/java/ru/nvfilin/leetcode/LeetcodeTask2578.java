package ru.nvfilin.leetcode;

import java.util.Arrays;

public class LeetcodeTask2578 {
    public int splitNum(int num) {
        char[] buffer = String.valueOf(num).toCharArray();
        Arrays.sort(buffer);
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for (int i = 0; i < buffer.length; i++) {
            if (i % 2 == 0) {
                first.append(buffer[i]);
            } else {
                second.append(buffer[i]);
            }
        }
        return Integer.parseInt(first.toString()) + Integer.parseInt(second.toString());
    }
}

/*
2578. Split With Minimum Sum

Given a positive integer num, split it into two non-negative integers num1 and num2 such that:

The concatenation of num1 and num2 is a permutation of num.
In other words, the sum of the number of occurrences of each digit in num1 and num2 is equal to the number of
occurrences of that digit in num.
num1 and num2 can contain leading zeros.
Return the minimum possible sum of num1 and num2.

Notes:

It is guaranteed that num does not contain any leading zeros.
The order of occurrence of the digits in num1 and num2 may differ from the order of occurrence of num.
*/
