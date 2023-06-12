package ru.nvfilin.leetcode;

public class LeetcodeTask2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        String[] buffer;
        for (String s : sentences) {
            buffer = s.split(" ");
            int outCount = buffer.length;
            if (outCount > max) max = outCount;
        }
        return max;
    }
}

/*
2114. Maximum Number of Words Found in Sentences

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.
*/
