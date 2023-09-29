package leetcode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/">Merge Sorted Array</a>
 */
public class P0088_MergeSortedArray {

    public static void main(String... args) {
        int[] array1 = {1, 2, 3, 0, 0, 0};
        int[] array2 = {2, 5, 6};
        int array1count = 3;
        int array2count = 3;

        getResult(array1, array1count, array2, array2count);

        System.out.println(Arrays.toString(array1));
    }

    public static void getResult(int[] nums1, int m, int[] nums2, int n) {
        int resultArraySize = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[resultArraySize--] = nums1[i--];
            } else {
                nums1[resultArraySize--] = nums2[j--];
            }
        }
    }
}
