package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2520Test {
    @Test
    public void test() {
        LeetcodeTask2520 leetcodeTask2520 = new LeetcodeTask2520();
        Assertions.assertEquals(leetcodeTask2520.countDigits(7), 1);
        Assertions.assertEquals(leetcodeTask2520.countDigits(121), 2);
        Assertions.assertEquals(leetcodeTask2520.countDigits(1248), 4);
        Assertions.assertEquals(leetcodeTask2520.countDigits(54), 0);
    }
}