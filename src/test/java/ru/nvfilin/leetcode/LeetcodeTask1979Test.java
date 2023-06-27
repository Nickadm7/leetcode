package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1979Test {

    @Test
    void findGCD() {
        LeetcodeTask1979 leetcodeTask1979 = new LeetcodeTask1979();
        Assertions.assertEquals(2, leetcodeTask1979.findGCD(new int[]{2,5,6,9,10}));
        Assertions.assertEquals(1, leetcodeTask1979.findGCD(new int[]{7,5,6,8,3}));
        Assertions.assertEquals(3, leetcodeTask1979.findGCD(new int[]{3,3}));
    }
}