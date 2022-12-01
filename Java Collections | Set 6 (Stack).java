GFG - Stack

Java provides an inbuilt object type called Stack. It is a collection that is based on the last in first out (LIFO) principle. Try this problem using Stack. 

Given n elements of a stack st where the first value is the bottom-most value of the stack and the last one is the element at top of the stack, delete the middle element 
of the stack without using any additional data structure.
  
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[n];
            for(int i = 0;i < n;i++)
                arr[i] = Integer.parseInt(a[i]);
            Stack<Integer> st = new Stack<>();
            for(int i = 0;i < n;i++)
                st.push(arr[i]);
            
            Solution ob = new Solution();
            Stack<Integer> ans = new Stack<>();
            ans = ob.deleteMid(n, st);
            while(!ans.empty()) {
                int x = ans.pop();
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        // code here
        int m=st.size()/2;
        
        Stack<Integer> s= new Stack<Integer>();
        for(int i =0; i< n;i++)
        {
            if(i == m)
            {
              st.pop();
            }
            else
            {
                s.push(st.pop());
            }
        }
         Collections.reverse(s);
        return s;
    }
}
