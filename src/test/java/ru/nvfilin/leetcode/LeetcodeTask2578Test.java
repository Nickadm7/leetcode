package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2578Test {

    @Test
    void splitNum() {
        LeetcodeTask2578 leetcodeTask2578 = new LeetcodeTask2578();
        Assertions.assertEquals(59, leetcodeTask2578.splitNum(4325));
        Assertions.assertEquals(75, leetcodeTask2578.splitNum(687));
    }
}