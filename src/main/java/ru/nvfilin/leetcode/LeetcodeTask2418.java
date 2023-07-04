package ru.nvfilin.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetcodeTask2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> buffer = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            buffer.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] out = new String[names.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            out[heights.length - 1 - i] = buffer.get(heights[i]);
        }
        return out;
    }
}

/*
2418. Sort the People

You are given an array of strings names, and an array heights that consists of distinct positive integers.
Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.
*/
