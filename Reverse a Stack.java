GFG - Stack

You are given a stack St. You have to reverse the stack using recursion.

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        //taking testcases
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		
    		//input n and d
    	    int n=Integer.parseInt(str);
    		Stack<Integer> stack=new Stack<>();
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		
    		//inserting elements in the array
    		for(int j=0;j<n;j++)
    		{
    		  stack.push(Integer.parseInt(starr1[j]));
    		}
    		//calling rotateArr() function
            ArrayList<Integer> res=Solution.reverse(stack);
            for(int ii=0;ii<res.size();ii++){
                System.out.print(res.get(ii));
                if(ii!=res.size()-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{ 
   
    static ArrayList<Integer> reverse(Stack<Integer> s)
    {
        // add your code here
       ArrayList<Integer> a = new ArrayList<>();
       rev(a,s);
       return a;
   }
   static void rev(ArrayList<Integer> a, Stack<Integer> s){
       if(! s.empty()) 
       {
       a.add(s.pop());
       rev(a, s);
       }
       
        
    //   ArrayList<Integer> a = new ArrayList<Integer>();
    //     while(! s.isEmpty())
    //     {
    //         int v = (Integer)s.pop();
    //         a.add(v);
    //     }
    //     return a;   
        
    }
}
