package leetcode;

/**
 * @see <a href="https://leetcode.com/problems/length-of-last-word/">
 * Length of Last Word</a>
 */
public class P0058_LengthOfLastWord {

    public static void main(String... args) {
        String input = "Hello World";
        int result = getResult(input);

        System.out.println(result);
    }

    // What if last character is " ",
    // Timme O(n), Space O(1)
    public static int getResult(String input) {
        int spacePosition = 0;
        if (input == null || input.length() == 0) {
            return 0;
        } else {
            for (int i = input.length() - 1; i > 0; i--) {
                if (input.charAt(i) != ' ' && input.charAt(i - 1) == ' ') {
                    spacePosition = i;
                    break;
                }
            }
            String temp = input.substring(spacePosition).trim();
            return temp.length();
        }
    }
}
