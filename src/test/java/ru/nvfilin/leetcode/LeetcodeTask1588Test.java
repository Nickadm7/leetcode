package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1588Test {

    @Test
    void sumOddLengthSubarrays() {
        LeetcodeTask1588 leetcodeTask1588 = new LeetcodeTask1588();
        Assertions.assertEquals(58, leetcodeTask1588.sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
        Assertions.assertEquals(3, leetcodeTask1588.sumOddLengthSubarrays(new int[]{1,2}));
        Assertions.assertEquals(66, leetcodeTask1588.sumOddLengthSubarrays(new int[]{10,11,12}));
    }
}