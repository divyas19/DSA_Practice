GFG - Stack

Given a string S, composed of different combinations of '(' , ')', '{', '}', '[', ']'. The task is to verify the validity of the arrangement.

An input string is valid if:

         1. Open brackets must be closed by the same type of brackets.
         2. Open brackets must be closed in the correct order.
           
 //{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String S = sc.nextLine().trim();
            Solution ob = new Solution();
            if(ob.valid(S))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
    Stack<Character> st = new Stack<Character>();
    for(int i =0 ; i <s.length(); i++)
    {
        if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
        {
          st.push(s.charAt(i));
        }
        else if(s.charAt(i) == ')')
        {
            if(st.empty())
            return false;
            else if(st.peek() != '(')
            return false;
            st.pop();
        }
         else if(s.charAt(i) == ']')
        {
            if(st.empty())
            return false;
            else if(st.peek() != '[')
            return false;
            st.pop();
        }
         else if(s.charAt(i) == '}')
        {
            if(st.empty())
            return false;
            else if(st.peek() != '{')
            return false;
            st.pop();
        }
        
    }
    if(st.size() > 0)
    return false;
    return true;
    }
} 
