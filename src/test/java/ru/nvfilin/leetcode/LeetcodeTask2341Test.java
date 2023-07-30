package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2341Test {

    @Test
    void numberOfPairs() {
        LeetcodeTask2341 leetcodeTask2341 = new LeetcodeTask2341();
        int[] expeted0 = new int[]{3, 1};
        int[] input0 = new int[]{1, 3, 2, 1, 3, 2, 2};

        int[] expeted1 = new int[]{1, 0};
        int[] input1 = new int[]{1, 1};

        int[] expeted2 = new int[]{0, 1};
        int[] input2 = new int[]{0};

        Assertions.assertArrayEquals(expeted0, leetcodeTask2341.numberOfPairs(input0));
        Assertions.assertArrayEquals(expeted1, leetcodeTask2341.numberOfPairs(input1));
        Assertions.assertArrayEquals(expeted2, leetcodeTask2341.numberOfPairs(input2));
    }
}