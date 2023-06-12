package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LeetcodeTask412Test {

    @Test
    void fizzBuzz() {
        LeetcodeTask412 leetcodeTask412 = new LeetcodeTask412();
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("Fizz");
        Assertions.assertIterableEquals(expected, leetcodeTask412.fizzBuzz(3));
    }
}