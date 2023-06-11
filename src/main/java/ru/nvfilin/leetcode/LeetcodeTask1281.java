package ru.nvfilin.leetcode;

public class LeetcodeTask1281 {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int buffer;
        while (n > 0) {
            buffer = n % 10;
            product *= buffer;
            sum += buffer;
            n = n / 10;
        }
        return product - sum;
    }
}

/*
1281. Subtract the Product and Sum of Digits of an Integer

Given an integer number n, return the difference between the product of its digits and the sum of its digits.
*/