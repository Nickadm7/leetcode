public class LeetcodeTask1528 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        int[] nums1 = new int[]{0, 1, 2};
        System.out.println(restoreString("codeleet", nums));
        System.out.println(restoreString("abc", nums1));
    }

    public static String restoreString(String s, int[] indices) {
        char[] out = new char[s.length()];
        for (int i = 0; i < out.length; i++) {
            out[indices[i]] = s.charAt(i);
        }
        return new String(out);
    }
}

/*
1528. Shuffle String

You are given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.
*/