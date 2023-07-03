package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2651Test {

    @Test
    void findDelayedArrivalTime() {
        LeetcodeTask2651 leetcodeTask2651 = new LeetcodeTask2651();
        Assertions.assertEquals(20, leetcodeTask2651.findDelayedArrivalTime(15, 5));
        Assertions.assertEquals(0, leetcodeTask2651.findDelayedArrivalTime(13, 11));
    }
}