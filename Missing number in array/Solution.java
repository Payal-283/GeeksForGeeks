// User function Template for Java
class Solution 
{
    int MissingNumber(int array[], int n) 
    {
        // Your Code Here
        int sum = (n*(n+1))/2;
        int i=0;
        while(i<n-1)
        {
            sum = sum - array[i];
            i++;
        }
        return(sum);
    }
}