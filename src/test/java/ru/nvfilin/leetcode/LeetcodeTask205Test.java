package ru.nvfilin.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetcodeTask205Test {

    @Test
    void isIsomorphic() {
        LeetcodeTask205 leetcodeTask205 = new LeetcodeTask205();
        Assertions.assertTrue(leetcodeTask205.isIsomorphic("egg", "add"));
        Assertions.assertFalse(leetcodeTask205.isIsomorphic("foo", "bar"));
        Assertions.assertTrue(leetcodeTask205.isIsomorphic("paper ", "title"));
    }
}