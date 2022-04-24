GFG - String

Given a string Str which may contains lowercase and uppercase chracters. The task is to remove all duplicate characters from the string and find the resultant string. 
The order of remaining characters in the output should be same as in the original string.
  
// { Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        // code here
        StringBuilder br = new StringBuilder();
    //   br.append(str.charAt(0));
       for(int i = 0; i < str.length(); i++)
       {
           String ch = str.substring(i,i+1);
        if(!( br.toString() ).contains(ch))
             br.append(ch);
       }
       String s = br.toString();
       return s;
    }
}

