GFG - String

Given string str of a constant length, print a triangle out of it. The triangle should start with the first character of the string and keep growing downwards by adding 
one character from the string.
The spaces on the left side of the triangle should be replaced with a dot character. 
  
//{ Driver Code Starts
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
            String str = read.readLine();
   
            Solution ob = new Solution();
            ob.printTriangleDownwards(str);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void printTriangleDownwards(String str){
        // code here
    if(str.length() == 1)
    System.out.println(str);
    else
    {
        int l = str.length()-2;
      for(int i = 0; i < str.length(); i++)
      {
          
          String st="";
          int j =0;
          while(j <= l)
          {
              st+=".";
              j++;
          }
          l--;
          st+=str.substring(0,i+1);
          System.out.println(st);
          
      }
    }
    
    }
}
