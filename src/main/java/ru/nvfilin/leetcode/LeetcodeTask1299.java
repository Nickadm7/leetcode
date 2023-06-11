package ru.nvfilin.leetcode;

public class LeetcodeTask1299 {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int buffer = arr[i];
            arr[i] = max;
            max = Math.max(buffer, max);
        }
        return arr;
    }
}

/*
1299. Replace Elements with Greatest Element on Right Side
        Given an array arr, replace every element in that array with the greatest element
        among the elements to its right, and replace the last element with -1.

        After doing so, return the array.
 */
