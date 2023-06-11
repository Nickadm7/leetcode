package ru.nvfilin.leetcode;

public class LeetcodeTask1323 {
    public int maximum69Number (int num) {
        char[] input = String.valueOf(num).toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '6') {
                input[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(input));
    }
}
