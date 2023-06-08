package src.main.java;

public class LeetcodeTask2011 {
    public static void main(String[] args) {
        String[] nums = new String[]{"--X", "X++", "X++"};
        String[] nums1 = new String[]{"++X", "++X", "X++"};
        String[] nums2 = new String[]{"X++", "++X", "--X", "X--"};
        System.out.println(finalValueAfterOperations(nums));
        System.out.println(finalValueAfterOperations(nums1));
        System.out.println(finalValueAfterOperations(nums2));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int out = 0;
        for (String s : operations) {
            if (s.charAt(1) == '-') out--;
            else out++;
        }
        return out;
    }
}

/*
2011. Final Value of Variable After Performing Operations

There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations,
return the final value of X after performing all the operations.
*/