package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask28Test {

    @Test
    void strStr() {
        LeetcodeTask28 leetcodeTask28 = new LeetcodeTask28();
        Assertions.assertEquals(0, leetcodeTask28.strStr("sadbutsad", "sad"));
        Assertions.assertEquals(-1, leetcodeTask28.strStr("leetcode", "leeto"));
    }
}