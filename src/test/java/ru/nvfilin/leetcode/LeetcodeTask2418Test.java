package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask2418Test {
    @Test
    void sortPeople() {
        LeetcodeTask2418 leetcodeTask2418 = new LeetcodeTask2418();
        String[] names = new String[]{"Mary","John","Emma"};
        String[] names1 = new String[]{"Alice","Bob","Bob"};
        int[] heights = new int[]{180,165,170};
        int[] heights1 = new int[]{155,185,150};

        Assertions.assertArrayEquals(new String[]{"Mary","Emma","John"}, leetcodeTask2418.sortPeople(names, heights));
        Assertions.assertArrayEquals(new String[]{"Bob","Alice","Bob"}, leetcodeTask2418.sortPeople(names1, heights1));
    }
}