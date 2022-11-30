GFG - String

You are given a string S, convert it into a magical string.
A string can be made into a magical string if the alphabets are swapped in the given manner: a->z or z->a, b->y or y->b, and so on.  
  
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.magicalString(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String magicalString(String S){
        // code here
        String s="";
        for(int i = 0 ; i < S.length();i++)
        {
            s+= (char)( 97+122-S.charAt(i));
        }
        return s;
    }
}
