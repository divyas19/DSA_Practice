GFG - Queue

In the game of Restricted Pacman, an infinite linear path is given. Pacman has to start at position 0 and eat as many candies as possible. In one move he can only jump a 
distance of either M or N.  If M and N are coprime numbers, find how many candies will be left on the board after the game is over.
Note: The result is always finite as after a point X every index in the infinite path can be visited. 
  
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
     public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.candies(m,n));
            t--;
        }
    } 
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int candies(int m, int n)
    {
        // Your code goes here 
        int a = (m-1)*(n-1);
        a = a/2;
        return a;
    
    }
}
