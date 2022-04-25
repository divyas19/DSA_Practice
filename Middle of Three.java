GFG - Basic

Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).
  
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A=Integer.parseInt(S[0]);
            int B=Integer.parseInt(S[1]);
            int C=Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.middle(A,B,C));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int middle(int A, int B, int C){
        //code here
        int a[] = new int[3];
        
        a[0] = A;
        a[1] = B;
        a[2] = C;
        
        Arrays.sort(a);
        
        return a[1];
    }
    
}

//  if(A<min(B,C))
//   return min(B,C);
       
//   if(B<min(A,C))
//   return min(A,C);
       
//     if(C<min(A,B))
//     return min(B,A);



// return (A+B+C)-( min(A,min(B,C)) + max(A,max(B,C)));


//   if(A>B && A<C || A<B && A>C) return A;
//       else if(B>A && B<C || B<A && B>C) return B;
       
//       return C;

