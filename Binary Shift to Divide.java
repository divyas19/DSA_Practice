GFG - Bit Magic

A number N is given. Divide it in half by using the binary shift operator.
Use the floor value if the result is in decimal. If the number is 1, leave it as it is.
  
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

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
            System.out.println(ob.half(N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int half(int N){
        // code here
        if(N == 1)
        return 1;
        else
        {
            return N>>1;
        }
    }
}
