GFG - String

Given two strings s1 and s2. The task is to check if s2 is a rotated version of the string s1. The characters in the strings are in lowercase.

// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException{
		
		//taking input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//taking total count of testcases
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    //Reading the two Strings
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    
		    //Creating an object of class Rotate
		    Solution obj = new Solution();
		    
		    //calling areRotations method 
		    //of class Rotate and printing
		    //"1" if it returns true
		    //else "0"
		    if(obj.areRotations(s1,s2))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}// } Driver Code Ends



class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s2.length() != s1.length())
        return false;
        else if((s1+s1).contains(s2))
        return true;
        else
        return false;
        
    }
    
}
