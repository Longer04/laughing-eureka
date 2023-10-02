package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/majority-element/">Majority Element</a>
 */
public class P0169_MajorityElement {

    public static void main(String... args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = getResult(nums);
        int result1 = majorityElement(nums);

        System.out.println(result);
        System.out.println(result1);
    }

    // Moore Voting Algorithm
    // The intuition behind the Moore's Voting Algorithm is based on the fact
    // that if there is a majority element in an array,
    // it will always remain in the lead,
    // even after encountering other elements.
    // Time O(n), Space O(1)
    private static int majorityElement(final int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int n : nums) {
            if (count == 0) {
                candidate = n;
            }
            if (n != candidate) {
                count--;
            } else {
                count++;
            }
        }
        return candidate;
    }

    // Time O(n), Space O(n) numbers stored in map
    private static int getResult(final int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        int topNumber = 0;
        int topCount = 0;
        for (int n : nums) {
            Integer count = numCount.getOrDefault(n, 0);
            int newCount = count + 1;
            if (topCount < newCount) {
                topCount = newCount;
                topNumber = n;
            }
            numCount.put(n, newCount);
        }
        return topNumber;
    }
}
