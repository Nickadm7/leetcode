package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1641Test {

    @Test
    void countVowelStrings() {
        LeetcodeTask1641 leetcodeTask1641 = new LeetcodeTask1641();
        Assertions.assertEquals(5, leetcodeTask1641.countVowelStrings(1));
        Assertions.assertEquals(15, leetcodeTask1641.countVowelStrings(2));
    }
}