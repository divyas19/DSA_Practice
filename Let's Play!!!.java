GFG - Array & Matrix

Let's play a game!! Given a matrix mat[][] with n x m elements. Your task is to check that matrix is Super Similar or not. To perform this task you have to follow these
Rules: Firstly all even index rows to be Rotated left and odd index rows to right, And Rotation is done X times(Index starting from zero). Secondly, After all the 
Rotations check if the initial and the final Matrix are same Return 1 else 0.

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            String arr[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[n][m];
            for(int i = 0;i < n*m;i++)
                mat[i/m][i%m] = Integer.parseInt(arr[i]);
            int x = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.isSuperSimilar(n, m, mat, x));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    
     static void rotL(int mat[][], int i, int m)
    {
        int v1 = mat[i][0];
    for(int k1 = 0 ; k1 < m-1; k1++)
    {
        mat[i][k1] = mat[i][k1+1];
    }
    mat[i][m-1] = v1;
    }
    
    static void rotR(int mat[][], int i, int m)
    {
        int v2 = mat[i][0];
    for(int k2 = 0 ; k2< m-1; k2++)
    {
        mat[i][k2] = mat[i][k2+1];
    }
    mat[i][m-1] = v2;
    }
    
    static int isSuperSimilar(int n, int m, int mat[][], int x)
    {
        // code here
        int matC[][] = new int[n][m];
        
        for(int p = 0 ; p < n; p++)
        {
            for(int q = 0 ; q < m; q++)
            matC[p][q] = mat[p][q];
        }
        
        for(int i = 0; i < n; i++)
        {
            if(i%2 == 0)
            {
                for(int t1 = 0 ; t1< x;t1++)
               rotL(mat,i,m);
            }
            else
            {
                 for(int t2 = 0 ; t2< x;t2++)
                rotR(mat,i,m);
            }
        }
        
        
        
        for(int r = 0 ; r < n; r++)
        {
            for(int t = 0 ; t < m; t++)
            {
                if(matC[r][t] != mat[r][t])
                return 0;
            }
            
        }
        
        return 1;
        
    }
    
}
