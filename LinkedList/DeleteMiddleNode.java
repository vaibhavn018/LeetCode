public class DeleteMiddleNode {
    public static ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode temp = new ListNode(0);
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = slow.next;
        return head;
    }

    
}
