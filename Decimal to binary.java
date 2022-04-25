GFG - Array

Given a decimal number N, compute its binary equivalent.
  
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
	void toBinary(int N) {
		//Write your code here
		int a[] = new int[N];
		int i = 0;
		while(N> 0)
		{
		    a[i] = N%2;
		    N = N/2;
		    i++;
		}
		for(int j = i-1; j >=0; j--)
		{
		    System.out.print(a[j]);
		}
	}
}
