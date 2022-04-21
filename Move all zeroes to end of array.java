GFG - Array

Given an array arr[] of N positive integers. Push all the zero’s of the given array to the right end of the array while maitaining the order of non-zero elements.
  
// { Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        
        int c = 0;
        
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                arr[c] = arr[i];
                c++;
            }
        }
        while(c< n)
        {
            arr[c] = 0;        
            c++;
        }
        
        
        
        
        // int i=0,j=n-1;
        
        // while(i<n)
        // {
        //     if(arr[i] == 0)
        //     {
        //         arr[j] = arr[i];
        //         j--;
        //         while(arr[i+1] != 0)
        //         {
        //             arr[i] = arr[i+1];
        //             i++;
        //         }
        //     }
        // }
        
        
        
        
        
        // int j =0;
        // while(j < n)
        // //for(int j = 0;j < n;j++)
        // {
        //     for(int i = 0; i < n-1; i++)
        //     {
        //         if(arr[i] == 0)
        //         {
        //             arr[i] = arr[i+1];
        //             arr[i+1] = 0;
        //         }
        //     }
        //     j++;
        // }
        
    }
}
