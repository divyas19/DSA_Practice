GFG - Array

Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.
  
// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        
        
        long p = 1;
        long ne = 1;
        
        if(n == 1)
        {
            long l1[] = new long[1];
            l1[0] = 1;
            return l1;
        }
        else if(n == 2)
        {
            long l2[] = new long[2];
            l2[0] = 1;
            l2[1] = 1;
            return l2;
        }
        else
        {
            long res[] = new long[n];
            res[0] = 1;
            res[1] = 1;
            for(int i = 2; i < n; i++)
            {
                res[i] = p+ne;
                ne = res[i];
                p = res[i-1];
            }
            return res;
        }
        
    }
}
