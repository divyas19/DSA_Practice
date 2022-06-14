GFG - Stack & String

You are given a string S, the task is to reverse the string using stack.
  
// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}
// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> st = new Stack<Character>();
        int n = S.length();
        int i = 0;
        while(i < n)
        {
            st.push(S.charAt(i));
            i++;
        }
        
        String ans = new String();
        
        int j = n-1;
         while(j >= 0)
        {
            char temp = st.pop();
            ans += temp;
            j--;
        }
        return ans;
    }

}

