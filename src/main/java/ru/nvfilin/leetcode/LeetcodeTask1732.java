package ru.nvfilin.leetcode;

public class LeetcodeTask1732 {

    public int largestAltitude(int[] gain) {
        int now = 0;
        int max = 0;
        for (int current : gain) {
            now += current;
            if (now > max) {
                max = now;
            }
        }
        return max;
    }
}

/*
1732. Find the Highest Altitude

There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain
in altitude between points i and i + 1 for all (0 <= i < n).
Return the highest altitude of a point.
*/
