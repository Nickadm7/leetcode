package ru.nvfilin.leetcode;

public class LeetcodeTask1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int buffer = 0;
            for (int i : account) {
                buffer += i;
            }
            if (buffer > max) max = buffer;
        }
        return max;
    }
}

/*
1672. Richest Customer Wealth

You are given an m x n integer grid accounts where accounts[i][j] is the amount of
        money the i customer has in the j bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.
*/