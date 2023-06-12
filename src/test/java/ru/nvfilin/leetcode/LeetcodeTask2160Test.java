package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2160Test {

    @Test
    void minimumSum() {
    LeetcodeTask2160 leetcodeTask2160 = new LeetcodeTask2160();
        Assertions.assertEquals(52, leetcodeTask2160.minimumSum(2932));
        Assertions.assertEquals(13, leetcodeTask2160.minimumSum(4009));
    }
}