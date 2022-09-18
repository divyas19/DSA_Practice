GFG - Basic

Geek created a random series and given a name geek-onacci series. Given four integers A, B, C, N. A, B, C represents the first three numbers of geek-onacci series. Find 
the Nth number of the series. The nth number of geek-onacci series is a sum of the last three numbers (summation of N-1th, N-2th, and N-3th geek-onacci numbers)

Input:
1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
2. The first line of each test case contains four space-separated integers A, B, C, and N.

Output: For each test case, print Nth geek-onacci number

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=1 ; k <=t;k++)
		{
		    
		  
		   
		    int a =sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		     int n = sc.nextInt();
		     
		   
		     
		   
		    if(n<= 3)
		   System.out.println("-1");

		    int ct = 4;
		    int f = a;
		    int s = b;
		    int th= c;
		    int v =0;
		    while(ct <= n)
		     {
		         v = f +s +th;
		         f = s; 
		         s = th;
		         th = v;
		         ct++;
		     }
		     System.out.println(v);
		   
		}
	}
}
