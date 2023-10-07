package leetcode;

import java.util.Stack;

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 */
public class P0020_ValidParentheses {

    public static void main(String... args) {

        final String valid = "()[]{}";
        final String invalid = "()[{}";

        final boolean validResult = getResult(valid);
        final boolean invalidResult = getResult(invalid);

        System.out.println(validResult);
        System.out.println(invalidResult);
    }

    // Time = O(n), Space = O(n) - worst case whole string is stored in stack.
    private static boolean getResult(final String input) {
        final Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                final Character element = stack.pop();
                if ((c == ')' && element != '(') ||
                        (c == ']' && element != '[') ||
                        (c == '}' && element != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
