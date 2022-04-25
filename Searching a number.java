GFG - Array

Given an array Arr of N elements and a integer K. Your task is to return the position of first occurence of K in the given array.
Note: Position of first element is considered as 1.
  
// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            str = br.readLine().trim().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().search(arr, n, k);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int search(int arr[], int n, int k) {

        // code here
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == k)
            return i+1;
        }
        return -1;
    }
}
