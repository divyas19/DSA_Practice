GFG - Arrays

Given an unsorted array, Arr[] of size N and that contains even number of occurrences for all numbers except two numbers. Find the two numbers in decreasing order which 
has odd occurrences.
  
//{ Driver Code Starts
//Initial Template for Java

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
            int N = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            long ans = obj.NoOfChicks(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long NoOfChicks(int N)
    {
        // Code here
        long noOfChick[] = new long[N];
        noOfChick[0] = 1;
        long total = 1;
        int d=1;
        
        for(;d<N;d++)    
        {
            if(d>=6)
        {
            total = total - noOfChick[d-6];
        }
            noOfChick[d]= total*2;
            total = total + total*2;
        }
        
        return total;
    }
}
