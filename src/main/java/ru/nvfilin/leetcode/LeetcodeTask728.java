package ru.nvfilin.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetcodeTask728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (checking(i)) out.add(i);
        }
        return out;
    }

    public static boolean checking(int input) {
        int buffer = input;
        while (input != 0) {
            int r = input % 10;
            if (r == 0) return false;
            if (!(buffer % r == 0)) {
                return false;
            }
            input = input / 10;
        }
        return true;
    }
}
