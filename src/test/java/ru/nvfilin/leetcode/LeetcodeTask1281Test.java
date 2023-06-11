package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1281Test {
    @Test
    public void test() {
        LeetcodeTask1281 leetcodeTask1281 = new LeetcodeTask1281();
        Assertions.assertEquals(leetcodeTask1281.subtractProductAndSum(234), 15);
        Assertions.assertEquals(leetcodeTask1281.subtractProductAndSum(4421), 21);
    }
}