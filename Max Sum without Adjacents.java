GFG - Array

Given an array Arr of size N containing positive integers. Find the maximum sum of a subsequence such that no two numbers in the sequence should be adjacent in the array.
  
// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        
        // code here
        int brr[] = new int[n];
        
        if(n >=1)
        brr[0] = arr[0];
        
        if(n>=2)
        brr[1] = Math.max(arr[0],arr[1]);
        
        if(n>=3)
        {
        for(int i = 2 ; i < n; i++)
        {
            brr[i] = Math.max(arr[i] + brr[i-2],brr[i-1]);
        }
        }
        return brr[n-1];
    }
}
