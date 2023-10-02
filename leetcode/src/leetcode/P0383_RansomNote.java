package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/ransom-note/">Ransom Note</a>
 * Assuming lowercase English letters
 */
public class P0383_RansomNote {

    public static void main(String... args) {

        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = getResult(ransomNote, magazine);
        boolean result2 = canConstruct(ransomNote, magazine);

        System.out.println(result);
        System.out.println(result2);
    }

    //Time O(m+n), Space O(magazine) stored in array
    private static boolean canConstruct(String ransomNote, String magazine) {
        int[] charCounts = new int[26];

        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (!(charCounts[c - 'a'] > 0)) {
                return false;
            }
            charCounts[c - 'a']--;
        }

        return true;
    }

    //Time O(m+n), Space O(ransomChars) stored in map
    private static boolean getResult(final String ransomNote, final String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> occurrences = new HashMap<>();
        char[] ransomChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();
        for (char rc : ransomChars) {
            Integer e = occurrences.getOrDefault(rc, 0);
            occurrences.put(rc, e + 1);
        }
        for (char mc : magazineChars) {
            if (occurrences.containsKey(mc)) {
                Integer count = occurrences.get(mc);
                if (count > 1) {
                    occurrences.put(mc, count - 1);
                } else {
                    occurrences.remove(mc);
                }
            }

        }
        if (occurrences.isEmpty()) {
            return true;
        }
        return false;
    }
}
