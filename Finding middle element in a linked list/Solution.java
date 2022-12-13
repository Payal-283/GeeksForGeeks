import org.w3c.dom.Node;

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
import java.util.*;
class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         int count = 0;
         Node temp = head;
         Node prev = head;
         while(temp!=null)
         {
             temp = temp.next;
             count++;
         }
         int len = count/2+1;
         int l = 1;
         while(l<len)
         {
             prev = prev.next;
             l++;
         }
         return prev.data;
    }
}