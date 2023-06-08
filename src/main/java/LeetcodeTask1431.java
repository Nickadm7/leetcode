package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class LeetcodeTask1431 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,5,1,3};
        int[] nums1 = new int[]{4,2,1,1,2};
        int[] nums2 = new int[]{12,1,12};
        System.out.println(kidsWithCandies(nums, 3));
        System.out.println(kidsWithCandies(nums1, 1));
        System.out.println(kidsWithCandies(nums2, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
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