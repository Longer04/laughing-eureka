package leetcode;

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 */
public class P0020_ValidParentheses {

    public static void main(String... args) {

        String valid = "()[]{}";
        String invalid = "()[{}";

        boolean validResult = getResult(valid);
        boolean invalidResult = getResult(invalid);

        System.out.println(validResult);
        System.out.println(invalidResult);
    }

    private static boolean getResult(final String input) {

        return false;
    }
}
