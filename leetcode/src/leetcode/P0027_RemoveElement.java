package leetcode;

/**
 * @see <a href="https://leetcode.com/problems/remove-element/description/">Remove Element</a>
 */
public class P0027_RemoveElement {

    public static void main(String... args) {
        int[] input = {0, 1, 2, 2, 3, 0, 4, 2};
        var val = 2;

        int result = getResult(input, val);

        System.out.println(result);
    }

    public static int getResult(int[] numbers, int val) {
        int lastInsertedIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != val){
                numbers[lastInsertedIndex] = numbers[i];
                lastInsertedIndex++;
            }
        }
        return lastInsertedIndex;
    }
}
