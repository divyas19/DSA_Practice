GFG - Basic

Given the maximum possible area of the right angle triangle for a fixed length of hypotenuse. The task is to find the length of hypotenuse.

Note: If the answer comes in Decimal, find it's Floor value.
  
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.getHypotenuse(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int getHypotenuse(Long N) {
        // code here
       
        return (int)(Math.floor(2*Math.sqrt(N)));
    }
};
