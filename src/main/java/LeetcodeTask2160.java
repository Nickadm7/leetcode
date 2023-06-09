package src.main.java;

import java.util.Arrays;

public class LeetcodeTask2160 {
    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
        System.out.println(minimumSum(4009));
    }

    public static int minimumSum(int num) {
        int[] input = new int[4];
        for (int i = 0; i < 4; i++) {
            input[i] = num % 10;
            num = num / 10;
        }
        Arrays.sort(input);
        return input[0] * 10 + input[2] + input[1] * 10 + input[3];
    }
}

/*
2160. Minimum Sum of Four Digit Number After Splitting Digits

You are given a positive integer num consisting of exactly four digits.
Split num into two new integers new1 and new2 by using the digits found in num.
Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.

For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3.
Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
Return the minimum possible sum of new1 and new2.
*/
