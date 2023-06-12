package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2114Test {

    @Test
    void mostWordsFound() {
        LeetcodeTask2114 leetcodeTask2114 = new LeetcodeTask2114();
        String[] actual = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] actual1 = new String[]{"please wait", "continue to fight", "continue to win"};
        Assertions.assertEquals(6, leetcodeTask2114.mostWordsFound(actual));
        Assertions.assertEquals(3, leetcodeTask2114.mostWordsFound(actual1));
    }
}