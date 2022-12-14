# Revise 
1 ->
    Problem :- Swap Nodes in Pairs  
    [Problem link](https://leetcode.com/problems/swap-nodes-in-pairs/)

2 -> 




# Day-1 

Problem-1 :- [Odd Even Linked List](OddEvenLL.java)  
[Problem link](https://leetcode.com/problems/odd-even-linked-list/)

Time - O(n). Space - O(1).

Initiate index = 1 to track down the even and odd nodes.
To track last odd node initialize lastOddNode = head.
 
Now declare a 2 variable to track even nodes. First one will store the first even node and second will track recent even Node.

Make a temp node and loop through entire LinkedList. 
Use while loop to iterate 
    if node is odd store this node in LastOddNode.next and move LastNode to one node forward.
    else store this node in evenNodeTemp.next and move evenNodeTemp to one node forward.

After joint evenNode head to last LastOddNode.
lastEvenNode to null to break the last chain.

Then return head.

# Day-2

Problem-2 :- [Swap Nodes in Pairs](SwapNodeInPairs.java)  
[Problem link](https://leetcode.com/problems/swap-nodes-in-pairs/)
This problem has 2 approach

i. Recursive 
O(n) -> space and time 

If head is null remaining or whole LL is null. If head.next is null then LL has only one node then swapping makes no sense.
    So return head.

Initialize newHead node and assign head.next as node.
make a recursion call and pass head.next.next as parameter store it in temp variable.
then newHead next becomes head and head next temp.
return newHead.

ii. Iterative approach
O(n) -> Time and O(1) -> Space

If head is null remaining or whole LL is null. If head.next is null then LL has only one node then swapping makes no sense. 
    So return head.

Initialize newHead node and assign head.next as node.
Initialize cur node and assign head as node.

Use while loop set condition if cur is not null or cur next is not null,
    use temp and store cur node and move cur node to next node.
    temp next will be cur next and cur next will be temp
    and move cur node to next node.
    use another condition to check whether cur or cur next is null
    if it is true,
        temp next is cur next;

after the loop swap will be completed

return newHead.

Problem-3 :- [Delete the Middle Node of a Linked List](OddEvenLL.java)  
[Problem link](https://leetcode.com/problems/odd-even-linked-list/)

Time - O(n) and Space - O(n)

If LL has only one element then 
    return null

Initialize two variables type ListNode named slow, fast and assign head.
temp will be another ListNode make new object and and give value 0.

Use while loop if fast or fast next is not null.
    temp = slow and move slow to one step and fast to two steps.

temp next will be slow next to delete middle node.

return head of the LL.