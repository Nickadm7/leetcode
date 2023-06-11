package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask1323Test {

    @Test
    public void test() {
        LeetcodeTask1323 leetcodeTask1323 = new LeetcodeTask1323();
        Assertions.assertEquals(leetcodeTask1323.maximum69Number(9669), 9969);
        Assertions.assertEquals(leetcodeTask1323.maximum69Number(9996), 9999);
        Assertions.assertEquals(leetcodeTask1323.maximum69Number(9999), 9999);
    }
}