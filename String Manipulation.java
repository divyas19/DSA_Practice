GFG - Stack

Tom is a string freak. He has got sequences of  n words to manipulate. If in a sequence, two same words come together then hell destroy each other. He wants to know the 
number of words left in the sequence after this pairwise destruction.
  
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            Vector<String> v = new Vector<>(); 
            for (int i = 0; i < n; i++) {
                v.addElement(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.removeConsecutiveSame(v));
            
        }
	}
}


// } Driver Code Ends



class Solution 
{
      
    static int removeConsecutiveSame(Vector <String > v) 
    {
        // Your code goes here
       Stack<String> ans = new Stack<String>();
        for(int i = 0; i < v.size(); i++)
        {
            if(ans.empty())
            {
                ans.push(v.get(i));
            }
            else 
            {
                if(ans.peek().equals(v.get(i)))
                  ans.pop();
                else
                  ans.push(v.get(i));
            }
        }
        // System.out.println(ans);
        return ans.size();
    }
}
