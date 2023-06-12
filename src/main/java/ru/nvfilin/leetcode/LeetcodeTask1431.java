package ru.nvfilin.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetcodeTask1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c: candies) {
            if (c > max) max = c;
        }
        List<Boolean> out = new ArrayList<>();
        for (int c: candies) {
            out.add(c + extraCandies >= max);
        }
        return out;
    }
}

/*
1431. Kids With the Greatest Number of Candies

There are n kids with candies. You are given an integer array candies, where each candies[i] represents
the number of candies the ith kid has, and an integer extraCandies,
denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
*/