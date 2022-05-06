GFG - Array

You don't need to read input or print anything. Complete the function isPlaindrome()which accepts string S and returns an integervalue 1 or 0.
  
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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here

    int l=0;
    int r=S.length()-1;
    char a[] = S.toCharArray();
    while(l<=r)
    {
        if(a[l]!=a[r])
        {
           return 0;
           
        }
        l++;
        r--;
    }
    
    return 1;
    }
};
