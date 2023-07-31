package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2769Test {

    @Test
    void theMaximumAchievableX() {
        LeetcodeTask2769 leetcodeTask2769 = new LeetcodeTask2769();
        Assertions.assertEquals(6, leetcodeTask2769.theMaximumAchievableX(4,1));
        Assertions.assertEquals(7, leetcodeTask2769.theMaximumAchievableX(3,2));
    }
}