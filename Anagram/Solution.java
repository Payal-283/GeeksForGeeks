package Anagram;
import java.util.Arrays;
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        //Your code here
        String a1=a.toLowerCase();
        String b1=b.toLowerCase();
        char[] ac = a1.toCharArray();
        char[] bc = b1.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        String fa = new String(ac);
        String fb = new String(bc);
        if(fa.equals(fb))
        return true;
        else
        return false;
    }
}