package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LeetcodeTask728Test {

    @Test
    void selfDividingNumbers() {
        LeetcodeTask728 leetcodeTask728 = new LeetcodeTask728();
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        List<Integer> expected1 = List.of(48,55,66,77);
        Assertions.assertIterableEquals(expected, leetcodeTask728.selfDividingNumbers(1, 22));
        Assertions.assertIterableEquals(expected1, leetcodeTask728.selfDividingNumbers(47, 85));
    }
}