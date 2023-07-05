package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask804Test {

    @Test
    void uniqueMorseRepresentations() {
        LeetcodeTask804 leetcodeTask804 = new LeetcodeTask804();
        Assertions.assertEquals(2, leetcodeTask804.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
        Assertions.assertEquals(1, leetcodeTask804.uniqueMorseRepresentations(new String[]{"a"}));
    }
}