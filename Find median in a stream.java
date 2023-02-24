GFG - PriorityQueue

Given an input stream of N integers. The task is to insert these numbers into a new stream and find the median of the stream formed by each insertion of X to the new stream.
  
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        int n;
        while(t-- > 0){
            n = sc.nextInt();
    
            Solution obj = new Solution();
            for(int i = 1; i <= n; i++)
            {
                int x =sc.nextInt();
                obj.insertHeap(x);
                System.out.println((int)Math.floor(obj.getMedian()));
            }
        }
        
        
    }
}


// } Driver Code Ends


class Solution
{
    
    static PriorityQueue<Integer> p1 = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> p2 = new PriorityQueue<>();
    //Function to insert heap.
    public static void insertHeap(int x)
    {
        // add your code here

        
        if(p1.isEmpty() || p1.peek()>=x)
        p1.add(x);
        else
        p2.add(x);
        balanceHeaps();
    }
    
    //Function to balance heaps.
    public static void balanceHeaps()
    {
       // add your code here
       if(p1.size()>p2.size()+1)
       {
           p2.add(p1.poll());
       }
       else if(p1.size()<p2.size())
       {
           p1.add( p2.poll());
       }
    }
    
    //Function to return Median.
    public static double getMedian()
    {
        // add your code here
        if(p1.size()== p2.size())
        {
            return (p1.peek()+p2.peek())/2.0;
        }
        return p1.peek();
    }
    
}
