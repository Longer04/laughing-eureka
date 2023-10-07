package leetcode;

/**
 * @see <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/">
 * Convert Sorted Array to Binary Search Tree</a>
 */
public class P0108_ConvertSortedArrayToBinarySearchTree {

    public static void main(String... args) {
        int[] input = {-10, -3, 0, 5, 9};

        TreeNode result = getResult(input);

        System.out.println(result);
    }

    public static TreeNode getResult(int[] numbers) {

        return createBST(numbers, 0, numbers.length - 1);
    }

    private static TreeNode createBST(int[] numbers, int i, int i1) {
        return new TreeNode();
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
