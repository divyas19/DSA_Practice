GFG - String and Stack

Given a String. Reverse each word in it where the words are separated by dots.

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String S)
    {
        // your code here
        String res ="";
        Stack<Character> st = new Stack<Character>();
       for(int i = 0; i < S.length();i++)
       {
           if(S.charAt(i) != '.')
           {
               st.push(S.charAt(i));
           }
           else
           {
               while(st.size() >0)
               res+= st.pop();
               res+=".";
           }
       }
       
       while(st.size() >0)
               res+= st.pop();
       
       return res;
    }
}
