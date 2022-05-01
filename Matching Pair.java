GFG - Mathematical 

Given a set of numbers from 1 to N, each number is exactly present twice so there are N pairs. In the worst-case scenario, how many numbers X should be picked and removed
from the set until we find a matching pair?
  
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.find(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static long find(int N){
        // code here
        return N+1;
    }
}
