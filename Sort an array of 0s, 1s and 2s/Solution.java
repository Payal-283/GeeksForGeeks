//User function template for Java
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int z=0,o=0,t=0;
        for(int i=0;i<n;i++)
        {
            if(a[i] == 0)
            z++;
            else if(a[i] == 1)
            o++;
            else
            t++;
        }
        for(int i=0;i<z;i++)
        {
            a[i] = 0;
        }
        for(int i=z;i<z+o;i++)
        {
            a[i] = 1;
        }
        for(int i=z+o;i<z+o+t;i++)
        {
            a[i] = 2;
        }
    }
}