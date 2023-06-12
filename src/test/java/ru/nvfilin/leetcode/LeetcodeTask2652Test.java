package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2652Test {

    @Test
    void sumOfMultiples() {
        LeetcodeTask2652 leetcodeTask2652 = new LeetcodeTask2652();
        Assertions.assertEquals(21, leetcodeTask2652.sumOfMultiples(7));
        Assertions.assertEquals(40, leetcodeTask2652.sumOfMultiples(10));
        Assertions.assertEquals(30, leetcodeTask2652.sumOfMultiples(9));
    }
}