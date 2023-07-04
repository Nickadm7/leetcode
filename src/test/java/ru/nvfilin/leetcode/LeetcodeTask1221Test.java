package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1221Test {

    @Test
    void balancedStringSplit() {
        LeetcodeTask1221 leetcodeTask1221 = new LeetcodeTask1221();
        Assertions.assertEquals(4, leetcodeTask1221.balancedStringSplit("RLRRLLRLRL"));
        Assertions.assertEquals(2, leetcodeTask1221.balancedStringSplit("RLRRRLLRLL"));
    }
}