GFG - String

Given a string S, consisting only of english alphabets, replace all the alphabets with the alphabets occuring at the same position when counted in reverse order of 
alphabets. For example, 'a' would be replaced by 'z', 'b' by 'y', 'c' by 'x' and so on. Any capital letters would be replaced by capital letters only.
  
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.convert(S));
            
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String convert(String s) 
    { 
         StringBuilder ans = new StringBuilder();
         for(int i=0; i<s.length(); i++)
         {
           char c = s.charAt(i);
       
           if(c>='A' && c<='Z')
           c = (char)('Z' + 'A' - c);
   
           else if(c>='a' && c<='z')
           c = (char)('z' + 'a' - c);
       
           ans.append(c);
          }
      return ans.toString();
    }
} 
