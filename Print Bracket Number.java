GFG - Stack

Given a string S, the task is to find the bracket numbers.
  
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            ArrayList<Integer> result = ob.barcketNumbers(S);
            for(int value :  result)
            System.out.print(value + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<Integer> barcketNumbers(String S) {
        // code here
        ArrayList<Integer> a = new ArrayList<Integer>();
         
        Stack<Integer> c = new Stack<Integer>();
       
        int ct= 0;
        
        
        for(int j = 0; j < S.length(); j++)
        { 
          if(S.charAt(j) == '(')
          {
          ct++;
          c.push(ct);
          a.add(ct);
          }
          else if(S.charAt(j) == ')')
          {
         a.add(c.pop());
          }
          
            }
        return a;
    }
}
