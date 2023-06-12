package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2427Test {
    @Test
    public void test() {
        LeetcodeTask2427 leetcodeTask2427 = new LeetcodeTask2427();
        Assertions.assertEquals(leetcodeTask2427.commonFactors(12, 6), 4);
        Assertions.assertEquals(leetcodeTask2427.commonFactors(25, 30), 2);
    }
}