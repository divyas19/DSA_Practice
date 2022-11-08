GFG - Queue

Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.
  
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //Taking input using class Scanner 
        Scanner sc = new Scanner(System.in);
        
        //Taking the number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking the range
            int n = sc.nextInt();
            
            //creating an ArrayList
            ArrayList<String> res = new ArrayList<String>();
            
            //calling the generate method of class solve
            //and storing the result in an ArrayList
            res = new solve().generate(n);
            
            //printing all the elements of the ArrayList
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends




class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static String toBin(int i)
    {
        String a= "";
        while(i!=0)
        {
           a+=i%2;
           i = i/2;
        }
    StringBuilder sb = new StringBuilder(a);
    sb.reverse();
    String ans = sb.toString();
        return ans;
    }
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> s = new ArrayList<String>();
        for(int i = 1; i <= N ;i++)
        {
         String t = toBin(i);
         s.add(t);
        }
        return s;
    }
    
}
