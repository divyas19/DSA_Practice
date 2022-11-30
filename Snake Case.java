GFG - String

Given a Sentence S of length N containing only english alphabet characters, your task is to write a program that converts the given sentence to Snake Case sentence. 
Snake case is the practice of writing compound words or phrases in which the elements are separated with one underscore character (_) and no spaces, and the first letter 
of each word written in lowercase. For ease keep all the characters in lowercase.
Note: The given sentence will not start with a Whitespace.
  
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.snakeCase(S,n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String snakeCase(String S , int n) {
        // code here
        return S.toLowerCase().replace(" ","_");
    }
};
