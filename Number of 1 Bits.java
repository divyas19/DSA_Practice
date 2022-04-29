GFG - Bit Magic

Given a positive integer N, print count of set bits in it. 
  
// { Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
		int c = 0;
		while(N> 0)
		{
		    int a = N%2;
		    if(a == 1) c++;
		    N = N/2;
		}
        return c;
    }
}
