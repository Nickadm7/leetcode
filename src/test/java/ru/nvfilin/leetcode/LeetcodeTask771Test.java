package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask771Test {
    @Test
    public void test() {
        LeetcodeTask771 leetcodeTask771 = new LeetcodeTask771();
        Assertions.assertEquals(leetcodeTask771.numJewelsInStones("aA", "aAAbbbb"), 3);
        Assertions.assertEquals(leetcodeTask771.numJewelsInStones("z", "ZZ"), 0);
    }
}