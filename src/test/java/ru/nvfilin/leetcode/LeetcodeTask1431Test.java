package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LeetcodeTask1431Test {

    @Test
    void kidsWithCandies() {
        LeetcodeTask1431 leetcodeTask1431 = new LeetcodeTask1431();
        List<Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(true);
        expected.add(true);
        expected.add(false);
        expected.add(true);
        List<Boolean> expected1 = new ArrayList<>();
        expected1.add(true);
        expected1.add(false);
        expected1.add(false);
        expected1.add(false);
        expected1.add(false);
        List<Boolean> expected2 = new ArrayList<>();
        expected2.add(true);
        expected2.add(false);
        expected2.add(true);

        Assertions.assertIterableEquals(expected, leetcodeTask1431.kidsWithCandies(new int[]{2,3,5,1,3}, 3));
        Assertions.assertIterableEquals(expected1, leetcodeTask1431.kidsWithCandies(new int[]{4,2,1,1,2}, 1));
        Assertions.assertIterableEquals(expected2, leetcodeTask1431.kidsWithCandies(new int[]{12,1,12}, 10));
    }
}