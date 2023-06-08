package src.main.java;

public class LeetcodeTask1672 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 2, 3}, {3, 2, 1}};
        int[][] nums1 = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        int[][] nums2 = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(nums));
        System.out.println(maximumWealth(nums1));
        System.out.println(maximumWealth(nums2));
    }

    public static int maximumWealth(int[][] accounts) {
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