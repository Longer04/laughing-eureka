package leetcode;

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">
 * Remove Duplicates from Sorted Array</a>
 */
public class P0026_RemoveDuplicatesFromSortedArray {

    public static void main(String... args) {
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int result = getResult(input);

        System.out.println(result);
    }

    public static int getResult(int[] numbers) {
        int counter = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                numbers[counter] = numbers[i];
                counter++;
            }
        }
        return counter;
    }
}
