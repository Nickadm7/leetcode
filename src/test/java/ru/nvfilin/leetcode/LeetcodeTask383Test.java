package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask383Test {

    @Test
    void canConstruct() {
        LeetcodeTask383 leetcodeTask383 = new LeetcodeTask383();
        Assertions.assertFalse(leetcodeTask383.canConstruct("a", "b"));
        Assertions.assertFalse(leetcodeTask383.canConstruct("aa", "ab"));
        Assertions.assertTrue(leetcodeTask383.canConstruct("aa", "aab"));
    }
}