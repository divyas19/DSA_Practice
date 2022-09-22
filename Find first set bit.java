GFG - Array

Given an integer an N. The task is to return the position of first set bit found from the right side in the binary representation of the number.
Note: If there is no set bit in the integer N, then return 0 from the function.  
  
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        // int i =0;
        while(n>0)
        {
         al.add(n%2);
         n=n/2;
        //  i++;
        }
    //   System.out.println(al);
        for(int j = 0; j < al.size() ; j++)
        {
            if(al.get(j) == 1)
            {
                return j+1;
            }
        }
         return 0;   
    }
}
