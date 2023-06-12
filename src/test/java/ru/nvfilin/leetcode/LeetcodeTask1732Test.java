package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1732Test {

    @Test
    void largestAltitude() {
        LeetcodeTask1732 leetcodeTask1732 = new LeetcodeTask1732();
        Assertions.assertEquals(1, leetcodeTask1732.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
        Assertions.assertEquals(0, leetcodeTask1732.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }
}