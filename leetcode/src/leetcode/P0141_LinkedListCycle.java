package leetcode;

/**
 * @see <a href="https://leetcode.com/problems/linked-list-cycle/">Linked List Cycle</a>
 * Floyd's Cycle-Finding Algorithm
 */
public class P0141_LinkedListCycle {

    public static void main(String... args) {

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        boolean result = getResult(node1);

        System.out.println(result);
    }

    //Time O(n), Space O(1)
    private static boolean getResult(final ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
