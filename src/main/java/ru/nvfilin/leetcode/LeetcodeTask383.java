package ru.nvfilin.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetcodeTask383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> buffer = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            if (buffer.containsKey(c)) {
                buffer.put(c, buffer.get(c) + 1);
            } else {
                buffer.put(c, 1);
            }
        }
        for (char c : ransomNote.toCharArray()) {
            if (!buffer.containsKey(c) || buffer.get(c) == 0) {
                return false;
            } else {
                buffer.put(c, buffer.get(c) - 1);
            }
        }
        return true;
    }
}

/*
383. Ransom Note

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using
the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
*/
