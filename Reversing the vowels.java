GFG - String

Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string.
  
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
            
            System.out.println(ob.modify(s));    
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        // your code here
         StringBuilder vov = new StringBuilder();
   
   for(int  i = 0; i <s.length(); i++) 
   {
   if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')  
   vov.append(s.charAt(i)); 
       
   }
   vov = vov.reverse();
   
  
   StringBuilder all = new StringBuilder(s);
   int j = 0;
   for(int  i = 0; i < all.length(); i++) 
   {
   if(all.charAt(i) == 'a' || all.charAt(i) == 'e' || all.charAt(i) == 'i' || all.charAt(i) == 'o' || all.charAt(i) == 'u') 
   all.setCharAt(i, vov.charAt(j++)); 
   }
   return String.valueOf(all);
    }
}

