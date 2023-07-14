package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask14Test {

    @Test
    void longestCommonPrefix() {
        LeetcodeTask14 leetcodeTask14 = new LeetcodeTask14();
        Assertions.assertEquals("fl", leetcodeTask14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assertions.assertEquals("", leetcodeTask14.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}