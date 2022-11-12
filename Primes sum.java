GFG - Logic

Given a number N. Find if it can be expressed as sum of two prime numbers.
  
//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static boolean prime(int i)
    {
        if(i==1)
        return false;
        if(i==2)
        return true;
        
        for(int j = 2; j <= Math.sqrt(i);j++)
        {
            if(i%j==0)
            return false;
            //return true;
        }
        return true;
    }
    static String isSumOfTwo(int N){
        // code here

        String S;
        if(N%2==0)
        S="Yes";
        else if(prime(N-2))
        S="Yes";
        else
        S="No";
       return S;
        
    }
}
