public class LeetcodeTask2114 {
    public static void main(String[] args) {
        String[] nums = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] nums1 = new String[]{"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(nums));
        System.out.println(mostWordsFound(nums1));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        String[] buffer;
        for (String s : sentences) {
            buffer = s.split(" ");
            int outCount = buffer.length;
            if (outCount > max) max = outCount;
        }
        return max;
    }
}

/*
2114. Maximum Number of Words Found in Sentences

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.
*/
