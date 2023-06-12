package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1672Test {

    @Test
    void maximumWealth() {
        LeetcodeTask1672 leetcodeTask1672 = new LeetcodeTask1672();
        int[][] nums = new int[][]{{1, 2, 3}, {3, 2, 1}};
        int[][] nums1 = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        int[][] nums2 = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        Assertions.assertEquals(6, leetcodeTask1672.maximumWealth(nums));
        Assertions.assertEquals(10, leetcodeTask1672.maximumWealth(nums1));
        Assertions.assertEquals(17, leetcodeTask1672.maximumWealth(nums2));
    }
}