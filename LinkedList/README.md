# LeetCode

# Revise 
1 ->
    Problem :- Swap Nodes in Pairs  
    Problem link :- [link](https://leetcode.com/problems/swap-nodes-in-pairs/)

2 -> 


# Solved Problems
Day-1 

Problem :- Odd Even Linked List [link](OddEvenLL.java)  
Problem link :- [link](https://leetcode.com/problems/odd-even-linked-list/)

Time - O(n). Space - O(1).

Question -
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7

Answer -
1 -> 3 -> 5 -> 7 -> 2 -> 4 -> 6

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

Day-2

Problem :- Swap Nodes in Pairs [link](SwapNodeInPairs.java)  
Problem link :- [link](https://leetcode.com/problems/swap-nodes-in-pairs/)
This problem has 2 approach

i. Recursive 
O(n) -> space and time 

If head is null remaining or whole LL is null. If head.next is null then LL has only one node then swapping makes no sense. So return head.
Initialize newHead node and assign head.next as value.
make a recursion call and pass head.next.next as parameter store it in temp variable.
then newHead next becomes head and head next temp.
return newHead.

ii. Iterative approach
O(n) -> Time and O(1) -> Space