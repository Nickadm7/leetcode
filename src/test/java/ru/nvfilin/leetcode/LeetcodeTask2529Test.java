package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2529Test {

    @Test
    void solution() {
        LeetcodeTask2529 leetcodeTask2529 = new LeetcodeTask2529();
        Assertions.assertEquals(3, leetcodeTask2529.solution(new int[]{-2, -1, -1, 1, 2, 3}));
        Assertions.assertEquals(3, leetcodeTask2529.solution(new int[]{-3, -2, -1, 0, 0, 1, 2}));
        Assertions.assertEquals(4, leetcodeTask2529.solution(new int[]{5, 20, 66, 1314}));
    }
}