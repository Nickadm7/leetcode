package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask88Test {

    @Test
    void merge() {
        LeetcodeTask88 leetcodeTask88 = new LeetcodeTask88();
        Assertions.assertArrayEquals(new int[]{1,2,2,3,5,6},
                leetcodeTask88.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3));

        Assertions.assertArrayEquals(new int[]{1}, leetcodeTask88.merge(new int[]{1}, 1, new int[]{}, 0));

        Assertions.assertArrayEquals(new int[]{1}, leetcodeTask88.merge(new int[]{0}, 0, new int[]{1}, 1));

    }
}