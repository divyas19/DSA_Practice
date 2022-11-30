GFG - String

Given a string consisting of lowercase letters, arrange all its letters in ascending order. 
  
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String s = sc.nextLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.sort(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String sort(String s) 
    {
        // code here
        String ans="";
        char c[] =s.toCharArray();
        
        Arrays.sort(c);
        for(int i = 0; i< c.length;i++)
        ans+=c[i];
        return ans;
    }
} 
