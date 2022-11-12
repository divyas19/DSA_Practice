GFG - ArrayList

ArrayList are dynamic size arrays. Try this problem using ArrayList.

Given a ArrayList of N elements and a integer Q defining the type of query(which will be either 1 or 2) :
Q = 1 includes two integers p and r. Which means insert the value r at index p in the ArrayList and print the whole updated ArrayList.
Q = 2 includes one integer p. In this query print the index at which the value p is last found in the ArrayList. If the value p is not found in the ArrayList then print "-1". 
  
//{ Driver Code Starts
import java.io.*;
import java.util.*; 

// } Driver Code Ends
class Solution 
{ 
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) 
    { 
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(Q ==1)
        {
            int p = Query.get(0);
            int r = Query.get(1);
            A.add(p,r);
            return A;
        }
        if(Q==2)
        {
            ans.add(A.lastIndexOf(Query.get(0)));
            return ans;
        }
        else
        {
            ans.add(-1);
            return ans;
        }
    }
}

//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                a.add(sc.nextInt());
            }
            ArrayList<Integer> query = new ArrayList<Integer>();
            if(q==1){
                query.add(sc.nextInt());
                query.add(sc.nextInt());
            }
            else{
                query.add(sc.nextInt());
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.solve(n,a,q,query);
            for(int i=0;i<ans.size();i++)
            {
                System.out.print(ans.get(i));
                if(q==1)
                System.out.print(" ");
            }
            System.out.println();
        }
    } 
} 
// } Driver Code Ends
