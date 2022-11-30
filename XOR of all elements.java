GFG - Bit Magic

Given a list A having N positive elements. The task to create another list such as ith element is XOR of all elements of  A except A[i].
  
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N = sc.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            for(int i=0;i<N;i++){
                A.add(sc.nextInt());
            }

            Solution ob = new Solution();
            ArrayList<Integer> B = ob.getXor(A,N);
            for(int i=0;i<N;i++){
                System.out.print(B.get(i)+" ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> getXor(ArrayList<Integer> A,int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
     
        int val=0;
        for(int i = 0;i < N;i++)
        {
            val = val^A.get(i);
        }
        for(int i = 0;i < N;i++)
        {
            ans.add(val^A.get(i));
        }
        return ans;
    }
}
