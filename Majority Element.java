GFG - Array

Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the 
array.
  
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        
        if(a.length == 1)
        {
            return a[0];
        }
       
       Integer ct= a.length/2;
       
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
      for (int c : a){
         if (hm.containsKey(c)){
            hm.put(c, hm.get(c) + 1);
         }else{
            hm.put(c, 1);
         }
      }
      
         for (int c : a){
             if(hm.get(c) > ct)
             return c;
         }
       
      
        return -1;
    }
}
