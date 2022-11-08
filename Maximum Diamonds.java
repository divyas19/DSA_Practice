GFG - Queue

There are N bags with diamonds in them. The i'th of these bags contains Ai diamonds. If you drop a bag with P diamonds, it changes to [P/2] diamonds, and you gain P 
diamonds, where [p] is the greatest integer less than p. Dropping a bag takes 1 minute. Find the maximum number of diamonds that you can take if you are given K minutes.
  
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);
            
            int[] A = new int[N];
            
            String S1[] = read.readLine().split(" ");
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxDiamonds(A,N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxDiamonds(int[] A, int N, int K) {
        // code here
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<N;i++)
        {
            pq.add(A[i]);
        }
        for(int i = 0 ; i < K ; i++)
        {
            
            int ct = pq.poll();
            ans = ans +ct;
            int v = ct/2;
            pq.add(v);
        }
        return ans;
    }
};
