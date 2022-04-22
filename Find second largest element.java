GFG - Array

Given an array of elements. Your task is to find the second maximum element in the array.
  
// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.print2largest(a,n));
        }
        
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    static int getL(int A[],int N)
    {
        int L = 0;
        for(int i = 1; i < N; i++)
        {
            if(A[i] > A[L])
            {
                L = i;
            }
        }
        return L;
    }
    public static int print2largest(int A[],int N) 
    {
        //CODE HERE
        int r =-1;
        int l = getL(A,N);
        for(int i = 0; i < N;i++)
        {
            if(A[i] != A[l])
            {
                
            if(r == -1)
            {
                r = i;
            }
            else if(A[i] > A[r])
            {
                r = i;
            }
                
            }
        }
        
        if(r == -1)
        {
            return -1;
        }
        else
      return A[r];
    }
}
        
