package ru.nvfilin.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetcodeTask2341 {
    public int[] numberOfPairs(int[] nums) {
        int count = 0;
        Set<Integer> buffer = new HashSet<>();
        for (Integer num : nums) {
            if (buffer.contains(num)) {
                count++;
                buffer.remove(num);
            } else {
                buffer.add(num);
            }
        }
        return new int[]{count, buffer.size()};
    }
}

/*
2341. Maximum Number of Pairs in Array

You are given a 0-indexed integer array nums. In one operation, you may do the following:

Choose two integers in nums that are equal.
Remove both integers from nums, forming a pair.
The operation is done on nums as many times as possible.

Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed
and answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.
*/
