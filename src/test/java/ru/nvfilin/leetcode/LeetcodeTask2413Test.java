package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2413Test {

    @Test
    void smallestEvenMultiple() {
    LeetcodeTask2413 leetcodeTask2413 = new LeetcodeTask2413();
        Assertions.assertEquals(10, leetcodeTask2413.smallestEvenMultiple(5));
        Assertions.assertEquals(6, leetcodeTask2413.smallestEvenMultiple(6));
    }
}