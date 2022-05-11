GFG - Matrix

Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.
  
// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int a[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    a[i][j] = Integer.parseInt(st[k++]);

            Solution ob = new Solution();
            ob.transpose(a, n);
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n;j++)
                    System.out.print(a[i][j] + " ");
            
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find transpose of a matrix.
    static void transpose(int matrix[][], int n)
    {
        // code here
        for(int k = 0; k < n; k++)
        {
        for(int j = k; j < n ; j++)
        {
            int t = matrix[k][j];
                matrix[k][j] = matrix[j][k];
                matrix[j][k] = t;
        }
        }
    }
}
