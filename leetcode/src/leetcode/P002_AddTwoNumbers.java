package leetcode;

/**
 * @see <a href="https://leetcode.com/problems/add-two-numbers/description/">Add Two Numbers</a>
 */
public class P002_AddTwoNumbers {

    public static void main(String... args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(2, node2);

        ListNode node6 = new ListNode(4);
        ListNode node5 = new ListNode(6, node6);
        ListNode node4 = new ListNode(5, node5);

        ListNode result = getResult(node1, node4);

        System.out.println(new StringBuilder(result.toString()).reverse());


    }

    public static ListNode getResult(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            if (next != null) {
                return val + next.toString();
            }
            return String.valueOf(val);
        }
    }
}
