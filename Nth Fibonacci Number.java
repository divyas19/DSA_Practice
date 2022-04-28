Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.
  
// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long nthFibonacci(long n){
        // code here
         long power = 1000000007;
        
        if(n == 1 || n==2)
        {
            return 1;
        }
        else
        {
            long p = 1;
        long ne = 1;
            
            for(int i = 3; i <= n; i++)
            {long t =p;
            p = ne%power;
            ne = (t+ne)%power;
            }
            return ne;
        }
        
    }
}
