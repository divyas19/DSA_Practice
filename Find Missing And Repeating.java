GFG - Array

Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these 
two numbers.
  
// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
         int sc= 0;
        
        for(int l = 0 ; l < n ; l++)
        {
            sc += arr[l];
        }
        
        Arrays.sort(arr);
        int v = 0;
        for(int i = 0; i < n-1;i++)
        {
           if(arr[i] == arr[i+1]) 
           v = i;
        }
        
        int res[] = new int[2];
        res[0] = arr[v];
        
       int s =0;
       
       for(int m = 1; m <= n; m++)
       {
           s+= m;
       }
       
        
        int sub = sc- res[0];
        
        res[1] = Math.max(sub-s,s -sub);
        
        return res;
        
    }
}
