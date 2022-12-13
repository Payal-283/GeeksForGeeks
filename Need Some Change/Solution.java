

//User function Template for Java

class Solution
{
    public void swapElements(int[] arr, int n)
    {
        // Code here
        int i=0;
        int j = i+2;
        while(j<n)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j++;
            i++;
        }
    }
}