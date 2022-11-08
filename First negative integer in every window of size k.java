GFG - Queue

Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.

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
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long> al = new ArrayList<Long>();
        int j = 0;
        for(int i = 0; i <=N-K;i++)
        {
            int l = i;
            int ct =0;
            while(l< i+K)
            {
            if(A[l] < 0 && ct==0)
            {
            al.add(A[l]);
            j++;
            ct++;
             break;
            }
            l++;
           
            }
            
            if(ct ==0 )
            {
             al.add((long)0);
            j++;
            }
            
        }
        long[] B = new long[al.size()];
        for(int m=0; m < al.size();m++)
        {
            B[m] = al.get(m);
        }
        return B;
    }
}
