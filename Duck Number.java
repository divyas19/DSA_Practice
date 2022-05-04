GFG - STRING

A Duck number is a positive number which has zeroes present in it, For example, 3210, 8050896, 70709 are all Duck numbers. A number with only leading 0s is not considered
as Duck Number. For example, numbers like 035 or 0012 are not considered as Duck Numbers. A number like 01203 is considered as Duck because there is a non-leading 0 
present in it.
The task is to check whether the given number N is a Duck number or not.
  
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
            String N = read.readLine();
            
            Solution ob = new Solution();
            if(ob.check_duck(N))
            System.out.println("YES");
            else
            System.out.println("NO");

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean check_duck(String N){
        // code here
        // boolean ans = false;
        
        int i = 1;
            if(N.charAt(0) == '0')
            {

               return false;
            }
            else{
            for(int k = 0; k <N.length(); k++)
             {
                 if(N.charAt(k) == '0')
                 {
                     return true;
                 }
             }
             return false;
            }
            
    }
}
