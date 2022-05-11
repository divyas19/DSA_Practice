GFG - Array

Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.
  
// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int l = 0, h = n-1;
while(l<=h)
        {
            int m = (h+l)/2;
            
            if(arr[m] == k)
            return m;
            else if(k < arr[m])
            h = m-1;
            else if(k>arr[m])
            l= m+1;
        }
        return -1;
    }
}
