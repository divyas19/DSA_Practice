GFG - String

//Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> hm  = new HashMap<Character,Integer>();
        int mx = -1;
        int i=0; 
        int j =0;
        while(j< s.length())
        {
            char ch = s.charAt(j);
           if(hm.containsKey(ch))
               hm.put(ch,hm.get(ch)+1);
           else
               hm.put(ch,1);
               
              
               if( hm.size() <k)
               {
                   j++;
               }
               else if( hm.size() ==k)
               {
                   mx = Math.max(mx,j-i+1);
                   j++;
               }
               else if( hm.size()>k)
               {
                   while( hm.size()>k)
                   {
                       if(hm.containsKey(s.charAt(i)))
                       {
                           hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                       }
                       if(hm.get(s.charAt(i)) ==0)
                       hm.remove(s.charAt(i));
                       i++;
                   }
                   j++;
               }
            
        }
      
        return mx;
    }
}
