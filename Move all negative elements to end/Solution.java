//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int p[] = new int[n];
        int ne[] = new int[n];
        int pc=0, nc=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                ne[nc] = arr[i];
                nc++;
            }
            else
            {
                p[pc] = arr[i];
                pc++;
            }
        }
        for(int i=0;i<pc;i++)
        arr[i] = p[i];
        for(int i=pc;i<pc+nc;i++)
        arr[i] = ne[i-pc];
    }
}