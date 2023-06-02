import java.util.Arrays;

public class LeetcodeTask1299 {
    public static void main(String[] args) {
        int[] nums = new int[]{17, 18, 5, 4, 6, 1};
        int[] nums1 = new int[]{400};
        System.out.println(Arrays.toString(replaceElements(nums)));
        System.out.println(Arrays.toString(replaceElements(nums1)));
    }

    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int buffer = arr[i];
            arr[i] = max;
            max = Math.max(buffer, max);
        }
        return arr;
    }
}

/*
1299. Replace Elements with Greatest Element on Right Side
        Given an array arr, replace every element in that array with the greatest element
        among the elements to its right, and replace the last element with -1.

        After doing so, return the array.

 */
