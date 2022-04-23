GFG - Array

Given an array of distinct elements. Find the third largest element in it.
Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, its output will be 5 because it is the 3 largest element in the array A.
  
 // { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}// } Driver Code Ends



class Solution
{
    
    int thirdLargest(int a[], int n)
    {
    int f = Integer.MIN_VALUE, s=Integer.MIN_VALUE,t=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
      if(f<=a[i])
      {
        t = s;
        s = f;
        f = a[i];
      }
      else if(s<=a[i])
      {
        t = s;
        s = a[i];
      }
      else if(t<=a[i])
      {
          t = a[i];
          
      }
    }
   
    
    if(n == 1 || n == 2)
    return -1;
    else
    return t;
    }
    
} 
    
