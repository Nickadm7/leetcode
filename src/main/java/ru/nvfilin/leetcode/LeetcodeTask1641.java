package ru.nvfilin.leetcode;

public class LeetcodeTask1641 {
    int a = 1, e = 1, i = 1, o = 1, u = 1;
    public int countVowelStrings(int n) {
        for (int j = 1; j < n; j++) {
            count();
        }
        return a + e + i + o + u;
    }

    private void count() {
        a = a + e + i + o + u;
        e = e + i + o + u;
        i = i + o + u;
        o = o + u;
    }
}

/*
1641. Count Sorted Vowel Strings

Given an integer n, return the number of strings of length n
that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.

A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.
*/
