package ru.nvfilin.leetcode;

public class LeetcodeTask1678 {
    public String interpret(String command) {
        char[] input = command.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'G') {
                sb.append('G');
            }
            if (input[i] == '(' && input[i + 1] == ')') {
                sb.append('o');
            }
            if (input[i] == '(' && input[i + 1] == 'a') {
                sb.append("al");
            }
        }
        return sb.toString();
    }
}

/*
1678. Goal Parser Interpretation

You own a Goal Parser that can interpret a string command.
The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.
*/