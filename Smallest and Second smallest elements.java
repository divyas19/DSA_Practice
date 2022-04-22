GFG - Array

Given an array of integers, your task is to find the smallest and second smallest element in the array. If smallest and second smallest do not exist, print -1.
  
// { Driver Code Starts
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
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute 
{
      public long[] minAnd2ndMin(long a[], long n) 
      {
        long r[] = {-1, -1};
        long f = Integer.MAX_VALUE;
        long s = Integer.MAX_VALUE;
        
        for (int i = 0; i < (int)n; i++) 
        {
            if (a[i] < f)
            {
                s = f;
                f = a[i];
            }
            else if (a[i] < s && a[i] > f)
            {
                s = a[i];
                
            }
        }
        
        if (f != Integer.MAX_VALUE && s != Integer.MAX_VALUE) 
        {
            r[0] = f;
            r[1] = s;
            return r;
        }
        
        return r;
    }
}
