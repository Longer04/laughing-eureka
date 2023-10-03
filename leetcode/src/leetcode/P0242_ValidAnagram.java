package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/valid-anagram/">Valid Anagram</a>
 */
public class P0242_ValidAnagram {

    public static void main(String... args) {

        String s1 = "anagram";
        String s2 = "ganamar";

        boolean result = getResult(s1, s2);
        boolean result2 = getResultWithArray(s1, s2);

        System.out.println(result);
        System.out.println(result2);

    }

    // Time O(s1 + s2), Space O(1) characters stored in fixed size array
    private static boolean getResultWithArray(String s1, String s2) {
        int[] charCount = new int[26];

        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            charCount[c - 'a']--;
        }
        for (int i : charCount) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    // Time O(s1 + s2), Space O(s1) characters stored in map
    private static boolean getResult(final String s1, final String s2) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            Integer count = charMap.getOrDefault(c, 0);
            charMap.put(c, count + 1);
        }
        for (char c : s2.toCharArray()) {
            if (!charMap.containsKey(c)) {
                return false;
            }
            Integer count = charMap.get(c);
            if (count == 1) {
                charMap.remove(c);
            } else {
                charMap.put(c, count - 1);
            }
        }
        return charMap.isEmpty();
    }
}
