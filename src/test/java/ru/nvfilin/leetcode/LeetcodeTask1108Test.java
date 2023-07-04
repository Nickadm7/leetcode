package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1108Test {

    @Test
    void defangIPaddr() {
        LeetcodeTask1108 leetcodeTask1108 = new LeetcodeTask1108();
        Assertions.assertEquals("1[.]1[.]1[.]1", leetcodeTask1108.defangIPaddr("1.1.1.1"));
        Assertions.assertEquals("255[.]100[.]50[.]0", leetcodeTask1108.defangIPaddr("255.100.50.0"));
    }
}