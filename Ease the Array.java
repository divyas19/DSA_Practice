GFG - Array

Given an array of integers of size, N. Assume ‘0’ as the invalid number and all others as a valid number. Write a program that modifies the array in such a way that 
if the next number is a valid number and is the same as the current number, double the current number value and replace the next number with 0. After the modification, 
rearrange the array such that all 0’s are shifted to the end and the sequence of the valid number or new doubled number is maintained as in the original array.
  
  // { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    int arr [] = new int[n];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<n;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    obj.modifyAndRearrangeArr(arr, n);
		    for(int i=0; i< n;i++){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution{
    void modifyAndRearrangeArr (int arr[], int n) {
        // Complete the function
        for(int j = 0; j <n-1; j++)
        {
            int t = j+1;
            if(arr[j] == arr[t])
            {
                arr[j] = arr[j]*2;
                arr[t] = 0;
            }
        }
        int c = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                arr[c] = arr[i];
                c++;
            }
        }
    
        for(int m = c; m <n; m++)
        {
            arr[m] = 0;        
            
        }
        
    }
}


