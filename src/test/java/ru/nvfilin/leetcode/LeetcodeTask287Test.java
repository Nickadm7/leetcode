package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask287Test {
    @Test
    public void test() {
        LeetcodeTask287 leetcodeTask287 = new LeetcodeTask287();
        Assertions.assertEquals(leetcodeTask287.findDuplicate(new int[]{1, 3, 4, 2, 2}), 2);
        Assertions.assertEquals(leetcodeTask287.findDuplicate(new int[]{3, 1, 3, 4, 2}), 3);
    }
}