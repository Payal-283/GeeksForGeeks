import org.w3c.dom.Node;

/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/
class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node current = head;
    	Node prev = head;
    	int count = 0;
    	/*while(current!=null)
    	{
    	    if(count>=n)
    	    prev = prev.next;
    	    
    	    current = current.next;
    	    count++;
    	}
    	if(count<n)
    	return -1;
    	
    	return prev.data;*/
    	while(current!=null)
    	{
    	    current = current.next;
    	    count++;
    	}
    	if(n>count)
    	return -1;
    	int position = count-n;
    	current = head;
    	while(position!=0)
    	{
    	    current = current.next;
    	    position--;
    	}
    	return current.data;
    }
}