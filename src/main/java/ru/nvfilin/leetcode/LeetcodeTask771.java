package ru.nvfilin.leetcode;

public class LeetcodeTask771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int out = 0;
        for (char jChar : jewels.toCharArray()) {
            for (char sChar : stones.toCharArray()) {
                if (jChar == sChar) {
                    out++;
                }
            }
        }
        return out;
    }
}

/*
771. Jewels and Stones

You're given strings jewels representing the types of stones that are jewels,
and stones representing the stones you have. Each character in stones is a type of stone you have.
You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/