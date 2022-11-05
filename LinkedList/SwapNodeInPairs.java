public class SwapNodeInPairs {
    public static ListNode swapPairsRec(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        ListNode temp = swapPairsRec(head.next.next);
        newHead.next = head;
        head.next = temp;

        return newHead;
    }

    public static ListNode swapPairsIte(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode newHead = cur.next;

        while (cur != null && cur.next != null) {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = cur.next;
            cur.next = temp;
            cur = temp.next;
            if (cur != null && cur.next != null) {
                temp.next = cur.next;
            }
        }

        return newHead;
    }
}

/*
 * 
 * 
 * i. Recursive
 * O(n) -> space and time
 * 
 * If head is null remaining or whole LL is null. If head.next is null then LL
 * has only one node then swapping makes no sense.
 * So return head.
 * 
 * Initialize newHead node and assign head.next as node.
 * make a recursion call and pass head.next.next as parameter store it in temp
 * variable.
 * then newHead next becomes head and head next temp.
 * return newHead.
 * 
 * ii. Iterative approach
 * O(n) -> Time and O(1) -> Space
 * 
 * If head is null remaining or whole LL is null. If head.next is null then LL
 * has only one node then swapping makes no sense.
 * So return head.
 * 
 * Initialize newHead node and assign head.next as node.
 * Initialize cur node and assign head as node.
 * 
 * Use while loop set condition if cur is not null or cur next is not null,
 * use temp and store cur node and move cur node to next node.
 * temp next will be cur next and cur next will be temp
 * and move cur node to next node.
 * use another condition to check whether cur or cur next is null
 * if it is true,
 * temp next is cur next;
 * 
 * after the loop swap will be completed
 * 
 * return newHead.
 * 
 * 
 * 
 */
