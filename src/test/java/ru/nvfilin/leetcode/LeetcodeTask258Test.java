package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask258Test {
    @Test
    public void test() {
        LeetcodeTask258 leetcodeTask258 = new LeetcodeTask258();
        Assertions.assertEquals(leetcodeTask258.addDigits(38), 2);
        Assertions.assertEquals(leetcodeTask258.addDigits(0), 0);
    }
}