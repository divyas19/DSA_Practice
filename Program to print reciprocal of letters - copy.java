GFG - String

Given a string S, we need to find reciprocal of it. The reciprocal of the letter is found by finding the difference between the position of the letter and the first 
letter ‘A’. Then decreasing the same number of steps from the last letter ‘Z’. The character that we reach after above steps is reciprocal.
Reciprocal of Z is A and vice versa because if you reverse the position of the alphabet A will be in the position of Z.
Similarly, if the letter is a small case then the first letter will be 'a' and the last letter will be 'z'. and the definition of reciprocal remains the same.

Note: If the character is not a letter its reciprocal will be the same character.
  
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            String reciprocal = ob.reciprocalString(S);
            System.out.println(reciprocal);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String reciprocalString(String S){
        // code here
         StringBuilder br = new StringBuilder();
        for(int i =0; i < S.length(); i++)
        {
            char c = S.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                c = (char)('a' + 'z' -c);
            }
            else if(c >='A'  && c  <= 'Z')
            {
                 c = (char)('A' + 'Z' -c);
            }
            else if(S.charAt(i) == ' ')
            {
                c = ' ';
            }
            br.append(c);
        }
        return br.toString();
    }
}
