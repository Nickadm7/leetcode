package ru.nvfilin.leetcode;

public class LeetcodeTask28 {
    public int strStr(String haystack, String needle) {
        int h = haystack.toCharArray().length;
        int n = needle.toCharArray().length;
        if (h == 0 || n == 0 || n > h) {
            return -1;
        }
        for (int i = 0; i < h - n + 1; i++) {
            int count = 0;
            while (count < n && haystack.charAt(i + count) == needle.charAt(count)) {
                count++;
            }
            if (count == n) {
                return i;
            }
        }
        return -1;
    }
}

/*
28. Find the Index of the First Occurrence in a String

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.
*/
