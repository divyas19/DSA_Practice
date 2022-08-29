GFG - Stack

Given a stack of integers of size N, your task is to complete the function pairWiseConsecutive(), that checks whether numbers in the stack are pairwise consecutive or 
not.The pairs can be increasing or decreasing, and if the stack has an odd number of elements, the element at the top is left out of a pair. The function should retain
the original stack content.

Only following standard operations are allowed on stack.

push(X): Enter a element X on top of stack.
pop(): Removes top element of the stack.
empty(): To check if stack is empty.
  

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;

class elements
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            Stack<Integer> st = new Stack<Integer>();
            int n = sc.nextInt();
            int temp = 0;
            for(int i = 0; i < n; i++)
            {
                temp = sc.nextInt();
                st.push(temp);
            }
            GFG gfg = new GFG();
            if(gfg.pairWiseConsecutive(st) == true)
            System.out.println("Yes");
            else
            System.out.println("No");
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// your task is to complete the function
// function should return true/false or 1/0
class GFG
{
    public static boolean pairWiseConsecutive(Stack<Integer> st)
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        int no = st.size();
        for(int i = 0 ; i < no; i++)
        {
            a.add(st.pop());
        }
        
        Collections.reverse(a);
        
        for(int j = 0 ;  j < no-1 ; j+= 2)
        {
            if(a.get(j)+1 != a.get(j+1))
            return false;
        }
      return true; 
    //   int no = st.size;
    //   for(int i = 0; i < no; i++)
    //   {
    //       if(st.elementAt(i)+1 != st.elementAt(i+1))
    //       return false;
    //   }
    //   return true;
	}
}
