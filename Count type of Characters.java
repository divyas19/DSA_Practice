GFG - String

Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values in the string.
Note: There are no white spaces in the string.
  
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here 
        int a[] = new int[4];
        int  u = 0,l=0,n=0,sp=0;
        for(int i =0; i < s.length();i++)
        {
            if((int)s.charAt(i) >= 65 &&  (int)s.charAt(i) <=90)
                u++;
            else if((int)s.charAt(i) >=97 && (int)s.charAt(i) <= 122)
            l++;
            else if((int)s.charAt(i) >=48 && (int)s.charAt(i) <=57)
            n++;
            else
            sp++;
        }
        a[0] = u;
        a[1] = l;
        a[2] = n;
        a[3] = sp;
        return a;
    }
}
