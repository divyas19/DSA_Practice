GFG - Bit Magic

Given a number N, the task is to find XOR of count of 0s and count of 1s in binary representation of a given number.

//{ Driver Code Starts

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.find_xor(n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends



class Solution
{
    public int find_xor(int n)
    {
        // Code here
        int val,c0=0,c1=0;
        while(n!=0)
        {
            val= n%2;
            n= n/2;
            if(val ==0)
            c0++;
            else
            c1++;
            
        }
        return c0^c1;
    }
}
