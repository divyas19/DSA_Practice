GFG - Recursion

Print a sequence of numbers starting with N where A[0] = N, without using loop, in which  A[i+1] = A[i] - 5,  until A[i] > 0. After that A[i+1] = A[i] + 5  repeat it 
until A[i] = N.

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.pattern(N);
            for(int i = 0;i < ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int i =0;
    public static void sub5(ArrayList<Integer> l,int i,int N)
    {
        
        l.add(l.get(i)-5);
        int t= l.get(i)-5;
        i++;
        if(l.get(i)>0)
        {
        sub5(l,i,N);
        
        }
        if(l.get(i) >0)
         l.add(t);
    }
    
    
    
    static List<Integer> pattern(int N){
        // code here
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(N);
        sub5(l,i,N);
        l.add(N);
       return l;
    }
}
