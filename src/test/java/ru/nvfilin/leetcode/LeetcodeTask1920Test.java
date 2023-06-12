package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1920Test {

    @Test
    void buildArray() {
        LeetcodeTask1920 leetcodeTask1920 = new LeetcodeTask1920();
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, leetcodeTask1920.buildArray(new int[]{0, 2, 1, 5, 3, 4}));
        Assertions.assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, leetcodeTask1920.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
    }
}