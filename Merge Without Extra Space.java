GFG - Array

Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space. Modify arr1 so that it 
contains the first N elements and modify arr2 so that it contains the last M elements.
  
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    static void swap(long arr1[], long arr2[],int i , int j)
    {
                long t= arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = t;   
    }
    
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i = n -1,j =0;
        while(i > -1 && j <m)
        {
        // for(int j = 0 ; j < m;j++)
        // {
            if(arr1[i]> arr2[j])
            {
                swap(arr1,arr2,i,j);
            }
        //   }
        i--;
        j++;
        }
    
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    
    }
}
