package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1299Test {
    @Test
    public void test() {
        LeetcodeTask1299 leetcodeTask1299 = new LeetcodeTask1299();
        int[] actual = leetcodeTask1299.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        int[] expected = new int[]{18, 6, 6, 6, 1, -1};
        Assertions.assertArrayEquals(actual, expected);
    }
}