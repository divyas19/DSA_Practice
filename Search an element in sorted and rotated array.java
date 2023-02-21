GFG - Array

Given a sorted and rotated array A of N distinct elements which are rotated at some point, and given an element K. The task is to find the index of the given element K in array A.

//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        	{
        		array[i] = sc.nextInt();
        	}
        	int target = sc.nextInt();

            Solution ob = new Solution();
			System.out.println(ob.Search(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int Search(int array[], int target)
	{
	    // code here
	    int l =0;
	    int h = array.length-1;
	   
	    while(l<=h)
	    {
	         int m = l+(h-l)/2;
	        if(array[m] == target)
	        return m;
	        
	        if(array[l] < array[m])
	        {
	            if(target>=array[l] && target < array[m])
	            {
	                h = m-1;
	            }
	            else{
	               l=m+1; 
	            }
	        }
	        else{
	            if(target>array[m] && target <= array[h])
	            {
	                l = m+1;
	            }
	            else{
	               h = m-1;
	            }
	        }
	    }
	    return -1;
	}
} 

