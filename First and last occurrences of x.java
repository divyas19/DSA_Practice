GFG - Array

Given a sorted array arr containing n elements with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given 
array.
  
// { Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class GFG
{
    static int getIt(long[] arr,int l, int h,int x,int type)
   {
       int r=-1;
       
       while(l<=h)
       {
           int m =l+(h-l)/2;
           
           if(arr[m]<x)
               l=m+1;
           else if(arr[m]>x)
               h=m-1;
           else
           {
               
               if(type==1)
               {
                   r = m;
                   h=m-1;
               }
               else
               {
                   r=m;
                   l=m+1;
               }
           }
       }
       return r;
   }
   ArrayList<Long> find(long arr[], int n, int x)
   {
       // code here
       int l=0;
       int h=n-1;
       
        ArrayList<Long> a =  new ArrayList<Long>();
        
       a.add((long)-1);
       a.add((long)-1);
       
       a.add(0,(long)getIt(arr,l,h,x,1));
       a.add(1,(long)getIt(arr,l,h,x,2));
       return a;
   }

}


// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
  // } Driver Code Ends
