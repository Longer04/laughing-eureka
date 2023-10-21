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
}
