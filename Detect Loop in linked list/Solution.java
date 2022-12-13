

//User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution 
{
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head)
    {
        // Add code here
        Node slowpointer = head;
        Node fastpointer = head;
        while(fastpointer!=null && fastpointer.next!=null)
        {
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next;
            fastpointer = fastpointer.next;
            if(slowpointer == fastpointer)
            return true;
        }
        return false;
    }
}