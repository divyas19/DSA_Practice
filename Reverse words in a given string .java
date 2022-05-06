GFG - String

Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
  
// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String[] ans = S.split("\\.");
    
  List<String> r = new ArrayList();
    for (String part : ans) {
     r.add(part);
    
    
    }     
     Collections.reverse(r);
    
          return String.join(".", r); 
        
    }
}
