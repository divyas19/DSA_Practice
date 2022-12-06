GFG - Array

Given 2 sorted arrays Ar1 and Ar2 of size N each. Merge the given arrays and find the sum of the two middle elements of the merged array.
  
//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int a[] = new int[n+n];
        int k =0;
        int i = 0,j=0;
        for( ; i < n && j<n;)
        {
            if(ar1[i]<=ar2[j])
            {
                a[k++] = ar1[i];
                i++;
            }
            else if(ar2[j]<=ar1[i])
            {
                a[k++] = ar2[j];
                j++;
            }
        }
        while(i<n)
        {
            a[k++] = ar1[i];
            i++;
        }
        while(j<n)
        {
            a[k++] = ar2[j];
            j++;
        }
        // for(int l= 0; l <= 2*n;l++)
        // System.out.print(a[l]+" ");
        return a[n-1]+a[n];
    }
}
