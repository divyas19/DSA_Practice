GFG - Array

Given an unsorted array arr[] of size N, rotate it by D elements (Anti - clockwise). 
Input:
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the 
array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.
Output:
For each testcase, in a new line, output the rotated array.
  
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void rot(int a[], int n, int r)
    {
          while(r>0)
		    {
		        int t = a[0];
		    for(int j = 0; j <n-1;j++)
		    {
		        
		        a[j] = a[j+1];
		      
		    }
		      a[n-1] = t;
		    r--;
		    }
		    
		    for(int m = 0; m< n; m++)
		    System.out.print(a[m]+" ");
		    
		    System.out.println();
		
        
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		//No of test cases
		int T = sc.nextInt();
		for(int i =1; i <= T;i++)
		{
		    //No of elements
		    int n = sc.nextInt();
		    int r = sc.nextInt();
		    int a[] = new int[n];
		    
		    for(int k = 0; k <n;k++)
		    {
		        a[k]  = sc.nextInt();
		    }
		    
	
		    
		    if(n== 2){
		        int v = a[0];
		        a[0] = a[1];
		        a[1] = v;
		    }
		    else{
		  rot(a,n,r);
		}
		
	}}
	
}
