GFG - Array

This is a function problem. The input is already taken care of by the driver code. You only need to complete the function modifyArray() that takes an array (arr),
sizeOfArray (n), and return the modified array. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
  
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
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    arr = obj.modifyArray(arr, sizeOfArray);
		    for(int i=0; i< sizeOfArray;i++){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    // Function for finding maximum and value pair
    // Complete the function
   public static int[] modifyArray (int arr[], int n) { 
    for(int i = 0;i < n; i++)
    {
        if(arr[i] != -1 && arr[i] != i)
        {
            int x = arr[i];
            while(arr[x] != x && arr[x] != -1)
            {
                int y = arr[x];
                arr[x] = x;
                x = y;
                
            }
            arr[x] = x;
            if(arr[i] != i)
            {
                arr[i] = -1;
            }
        }
    }
    
    
    return arr;
    
   }
}



    // static void swap(int arr[],int j,int i)
    //     {
    //         int t = arr[j];
    //               arr[j] = arr[i];
    //               arr[i] = t;
    //     }
    
    // public static int[] modifyArray (int arr[], int n) {
        
    //     int brr[] = new int[n];
    //     for(int k =0 ; k < n; k++)
    //     {
    //         brr[k] = -1;
    //     }
        
        
    //     for(int i = 0; i < n; i++)
    //     {
    //         for(int j = 0 ; j< n; j++)
    //         {
    //             if(arr[j] == i)
    //             {
    //                 swap(arr,j,i);
    //               brr[i] = i;
    //             }
    //         }
    //     }
        
    //     return brr;
        


