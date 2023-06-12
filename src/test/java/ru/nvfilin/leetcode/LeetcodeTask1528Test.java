package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetcodeTask1528Test {

    @Test
    void restoreString() {
        LeetcodeTask1528 leetcodeTask1528 = new LeetcodeTask1528();
        assertEquals("leetcode", leetcodeTask1528.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        assertEquals("abc", leetcodeTask1528.restoreString("abc", new int[]{0, 1, 2}));
    }
}