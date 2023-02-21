GFG - Array

Given a sorted array consisting 0s and 1s. The task is to find the index of first 1 in the given array.
  
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.firstIndex(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        
    //     long ct =0;
    //     if(arr[0] ==1)
    //     return ct;
        
    //     for(int i =1; i < n; i++)
    //  {
    //     ct++;
    //     if ( (arr[i-1]+arr[i]) > 0 )
    //     return ct;
        
    //  }
     
    //  return -1;
    int l=0;
    int h = arr.length;
    int ans = -1;
    while(l<=h && l <arr.length)
    {
        int m = l+(h-l)/2;
        if(arr[m] == 1)
        {
        ans =m;
        h=m-1;
        }
        else if(arr[m] <1){
            l =m+1;
        }
        
      
    }
    
    
      return (long)ans;
    }
}
