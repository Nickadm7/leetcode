package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2169Test {

    @Test
    void countOperations() {
        LeetcodeTask2169 leetcodeTask2169 = new LeetcodeTask2169();
        Assertions.assertEquals(3, leetcodeTask2169.countOperations(2, 3));
        Assertions.assertEquals(1, leetcodeTask2169.countOperations(10, 10));
    }
}