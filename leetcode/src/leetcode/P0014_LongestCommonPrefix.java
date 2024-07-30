package leetcode;

import java.util.Arrays;

/**
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 */
public class P0014_LongestCommonPrefix {

    public static void main(String... args) {
        String[] strings = {"flower", "flow", "flight"};

        String result = getResult(strings);

        System.out.println(result);
    }

    //Time - Sorting O(Nlog(N) + M), Space - O(1)
    public static String getResult(String[] val) {
        if (val.length > 1) {
            Arrays.sort(val);
            String s1 = val[0];
            String s2 = val[val.length - 1];
            int idx = 0;
            while (idx < s1.length() && idx < s2.length()) {
                if (s1.charAt(idx) == s2.charAt(idx)) {
                    idx++;
                } else {
                    break;
                }
            }
            return s1.substring(0, idx);
        }
        return "";
    }

    //Time - O(N + M(longest string), Space - O(1)
    public static String getResult2(String[] val) {
        if (val == null || val.length == 0) return "";
        String prefix = val[0];
        for (String s : val) {
            while (s.indexOf(prefix) != 0) {
                prefix = s.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
