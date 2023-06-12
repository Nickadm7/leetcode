package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1486Test {

    @Test
    void xorOperation() {
        LeetcodeTask1486 leetcodeTask1486 = new LeetcodeTask1486();
        Assertions.assertEquals(8, leetcodeTask1486.xorOperation(5, 0));
        Assertions.assertEquals(8, leetcodeTask1486.xorOperation(4, 3));
    }
}