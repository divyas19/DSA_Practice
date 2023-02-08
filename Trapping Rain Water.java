GFG - Arrays

Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks 
during the rainy season.
  
//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int l[]= new int[arr.length];
        int r[]= new int[arr.length];
        l[0]=arr[0];
        for(int i = 1; i < arr.length;i++)
        {
            if(arr[i]> l[i-1])
            {
            l[i]=arr[i];
            }
            else
            {
                l[i] = l[i-1];
            }
        }
        
        r[arr.length-1]=arr[arr.length-1];
        for(int i = arr.length-2; i >=0;i--)
        {
            if(arr[i]> r[i+1])
            {
            r[i]=arr[i];
            }
            else
            {
                r[i] = r[i+1];
            }
        }
        long sum =0;
        for(int i = 0 ; i < arr.length; i++)
        {
            sum+=  (Math.min(l[i],r[i])-arr[i]);
        }
        
        return sum;
    } 
}


