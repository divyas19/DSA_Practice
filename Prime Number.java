GFG - Basic

For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.
  
// { Driver Code Starts
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
            System.out.println(ob.isPrime(N));
        }
    }
}// } Driver Code Ends


class Solution{
    static int isPrime(int N)
    {
        // code here
        int f= 1;
        
        if(N ==0 || N==1)
        {
            return 0;
        }
        else{
        for (int i = 2; i <= Math.sqrt(N); i++)
        {
            if(N%i ==0)
            {
                f = 0;
                
            }
        }
        
       return f;
        }
    }
}
