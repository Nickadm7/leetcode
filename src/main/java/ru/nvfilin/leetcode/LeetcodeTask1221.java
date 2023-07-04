package ru.nvfilin.leetcode;

public class LeetcodeTask1221 {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }
        return count;
    }
}

/*
1221. Split a String in Balanced Strings

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.
*/
