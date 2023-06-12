package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetcodeTask1678Test {
    @Test
    void interpret() {
        LeetcodeTask1678 leetcodeTask1678 = new LeetcodeTask1678();
        assertEquals("Goal", leetcodeTask1678.interpret("G()(al)"));
        assertEquals("Gooooal", leetcodeTask1678.interpret("G()()()()(al)"));
        assertEquals("alGalooG", leetcodeTask1678.interpret("(al)G(al)()()G"));
    }
}