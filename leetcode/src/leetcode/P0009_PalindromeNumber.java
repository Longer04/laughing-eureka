package leetcode;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-number/">Palindrome Number</a>
 */
public class P0009_PalindromeNumber {

    public static void main(String... args) {
        int valid = 121;
        int invalid = 123;

        boolean result1 = getResult(valid);
        boolean result2 = getResult(invalid);


        System.out.println(result1);
        System.out.println(result2);

    }

    public static boolean getResult(int val) {
        if (val < 0 || val != 0 && val % 10 == 0) return false;
        int check = 0;
        while (val > check) {
            check = check * 10 + val % 10;
            val /= 10;
        }
        return (val == check || val == check / 10);
    }
}
