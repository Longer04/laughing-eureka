package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/word-pattern/">Word Pattern</a>
 * Time complexity O(n)
 * Space complexity O(n)
 */
public class P0290_WordPattern {

    public static void main(String... args) {

        final String pattern = "abba";
        final String validString = "dog cat cat fish";
        final String invalidString = "dog dog dog dog";

        boolean result = getResult(pattern, validString);
        System.out.println(result);
    }

    public static boolean getResult(String pattern, String testedString) {
        Map<String, Character> patternMap = new HashMap<>();
        Set<Character> seenPattern = new HashSet<>();

        final String[] splitString = testedString.split(" ");
        if (splitString.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < splitString.length; i++) {
            final String currentKey = splitString[i];
            final Character currentPattern = pattern.charAt(i);
            final Character patternForCurrentKey = patternMap.getOrDefault(currentKey, currentPattern);
            if (!patternMap.containsKey(currentKey)) {
                if (seenPattern.contains(patternForCurrentKey)) {
                    return false;
                }
                seenPattern.add(patternForCurrentKey);
                patternMap.put(currentKey, patternForCurrentKey);
            }
            if (patternMap.containsKey(currentKey) && !patternMap.get(currentKey).equals(currentPattern)) {
                return false;
            }
        }
        return true;
    }
}
