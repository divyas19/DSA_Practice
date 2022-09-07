GFG - Array

Given an array of size N containing positive integers n and a number k,The absolute difference between values at indices i and j is |a[i] a[j]|. There are n*(n-1)/2 such 
pairs and you have to print the kth smallest absolute difference among all these pairs.
  
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
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            System.out.println(obj.kthDiff(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long kthDiff(int arr[], int n, int k)
    {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j < n;j++)
            {
             al.add(Math.abs(arr[i]-arr[j]));
            }
        }
        Collections.sort(al);
        return al.get(k-1);
        
       
        
    }
}
