GFG - Stack

Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}// } Driver Code Ends




class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<Character>();
        char s[] = new char[x.length()];
        s = x.toCharArray();
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='(' || s[i]=='[' || s[i]=='{')
            {
                st.push(s[i]);
            }
            else
            {
                if(st.size() < 1)
                {
                   return false;
                }
                else if(s[i]==')' && st.peek()!='(')
                {
                    return false;
                }
                else if(s[i]==']' && st.peek()!='[')
                {
                    return false;
                }
                else if(s[i]=='}' && st.peek()!='{')
                {
                    return false;
                }
                else
                st.pop();
            }
        }
        if(st.size() < 1)
            return true;
        return false;
        
        
    }
}
