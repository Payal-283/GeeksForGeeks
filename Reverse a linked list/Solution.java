import org.w3c.dom.Node;

//function Template for Java

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node current = head;
        Node prev = null;
        Node forward = null;
        while(current!=null)
        {
            forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;
        }
        return prev;
    }
}