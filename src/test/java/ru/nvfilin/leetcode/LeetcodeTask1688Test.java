package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1688Test {

    @Test
    void numberOfMatches() {
        LeetcodeTask1688 leetcodeTask1688 = new LeetcodeTask1688();
        Assertions.assertEquals(6, leetcodeTask1688.numberOfMatches(7));
        Assertions.assertEquals(13, leetcodeTask1688.numberOfMatches(14));
    }
}