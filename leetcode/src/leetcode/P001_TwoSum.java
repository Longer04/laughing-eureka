package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/two-sum/description/">Two Sum</a>
 * Time complexity O(n)
 * Space complexity O(n)
 */
public class P001_TwoSum {

    public static void main(String... args) {

        int[] integers = {2, 7, 11, 15};
        int target = 18;

        int[] result = getResult(integers, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getResult(int[] integers, int target) {
        Map<Integer, Integer> seenMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < integers.length; i++) {
            int searched = target - integers[i];
            if (seenMap.containsKey(searched)) {
                result[1] = i;
                result[0] = seenMap.get(searched);
            } else {
                seenMap.put(integers[i], i);
            }
        }
        return result;
    }
}
