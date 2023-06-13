package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2396Test {

    @Test
    void isStrictlyPalindromic() {
        LeetcodeTask2396 leetcodeTask2396 = new LeetcodeTask2396();
        Assertions.assertFalse(leetcodeTask2396.isStrictlyPalindromic(9));
        Assertions.assertFalse(leetcodeTask2396.isStrictlyPalindromic(4));
    }
}