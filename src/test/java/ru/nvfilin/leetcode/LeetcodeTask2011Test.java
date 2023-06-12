package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2011Test {

    @Test
    void finalValueAfterOperations() {
        LeetcodeTask2011 leetcodeTask2011 = new LeetcodeTask2011();
        Assertions.assertEquals(1, leetcodeTask2011.finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
        Assertions.assertEquals(3, leetcodeTask2011.finalValueAfterOperations(new String[]{"++X", "++X", "X++"}));
        Assertions.assertEquals(0, leetcodeTask2011.finalValueAfterOperations(new String[]{"X++", "++X", "--X", "X--"}));
    }
}