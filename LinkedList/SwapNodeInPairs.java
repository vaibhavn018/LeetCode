public class SwapNodeInPairs {
    public static ListNode swapPairsRec(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        ListNode temp = swapPairsRec(head.next.next);
        newHead.next = head;
        head.next = temp;

        return newHead;
    }
}
