package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1512Test {

    @Test
    void numIdenticalPairs() {
        LeetcodeTask1512 leetcodeTask1512 = new LeetcodeTask1512();
        Assertions.assertEquals(4, leetcodeTask1512.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        Assertions.assertEquals(6, leetcodeTask1512.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        Assertions.assertEquals(0, leetcodeTask1512.numIdenticalPairs(new int[]{1, 2, 3}));
    }
}