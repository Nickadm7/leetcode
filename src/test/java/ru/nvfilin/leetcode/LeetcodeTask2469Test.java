package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2469Test {

    @Test
    void convertTemperature() {
        LeetcodeTask2469 leetcodeTask2469 = new LeetcodeTask2469();
        Assertions.assertArrayEquals(new double[]{309.65, 97.7}, leetcodeTask2469.convertTemperature(36.50));
        Assertions.assertArrayEquals(new double[]{395.26, 251.798}, leetcodeTask2469.convertTemperature(122.11));
    }
}