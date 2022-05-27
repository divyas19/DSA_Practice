GFG - Basic

For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is 
equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
  
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
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
         int a=n%10;
         int b= (n/10)%10;
        int c = n/100;
       if( a*a*a + b*b*b + c*c*c == n)
           return "Yes";
       else
           return "No";
    }
}
