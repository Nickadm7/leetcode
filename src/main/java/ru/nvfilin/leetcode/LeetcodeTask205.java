package ru.nvfilin.leetcode;

public class LeetcodeTask205 {
    public boolean isIsomorphic(String s, String t) {
        int[] buffer1 = new int[256];
        int[] buffer2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char currentT = t.charAt(i);
            if (buffer1[currentS] != buffer2[currentT]) {
                return false;
            }
            buffer1[currentS] = i + 1;
            buffer2[currentT] = i + 1;
        }
        return true;
    }
}

/*
205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.
*/