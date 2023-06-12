package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2535Test {

    @Test
    void differenceOfSum() {
        LeetcodeTask2535 leetcodeTask2535 = new LeetcodeTask2535();
        Assertions.assertEquals(9, leetcodeTask2535.differenceOfSum(new int[]{1, 15, 6, 3}));
        Assertions.assertEquals(0, leetcodeTask2535.differenceOfSum(new int[]{1, 2, 3, 4}));
    }
}