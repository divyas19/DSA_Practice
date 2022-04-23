GFG - Array

Given an array Arr (distinct elements) of size N. Rearrange the elements of array in zig-zag fashion. The converted array should be in form a < b > c < d > e < f. 
The relative order of elements is same in the output i.e you have to iterate on the original array only.
  
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

            new Solution().zigZag(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution {
    
    static void swap(int arr[], int i ,int a, int b)
    {
        int t = a;
        arr[i] = b;
        arr[i+1] = t;
    }
    
    void zigZag(int arr[], int n) {
        // code here
       
       for(int i = 0; i < n-1; i++)
       {
           if(i%2 == 0 && arr[i]>arr[i+1])
           {
            //   if(arr[i]>arr[i+1])
               swap(arr, i,arr[i],arr[i+1]);
           }
           else if(i%2 == 1 && arr[i]<arr[i+1])
           {
            //   if(arr[i]<arr[i+1])
               swap(arr,i ,arr[i],arr[i+1]);
           }
       }
        
        
        
    }
}
        
