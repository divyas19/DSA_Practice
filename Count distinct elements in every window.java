GFG - HashMap

Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.
  
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int N, int K)
    {
        // code here 
        ArrayList<Integer> al = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i< K;i++)
        {
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        al.add(hm.size());
        for(int i = K; i< N;i++)
        {
            if(hm.get(A[i-K]) == 1)
            hm.remove(A[i-K]);
            else 
            hm.put(A[i-K],hm.getOrDefault(A[i-K],0) -1);
            
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            al.add(hm.size());
        }
        return al;
    }
}

