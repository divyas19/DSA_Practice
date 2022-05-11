GFG - String

Given a string str and an integer K, find whether the string can be changed into a pangram after at most k operations. A pangram is a sentence containing every letter in 
the english alphabet. A single operation can be used to swap an existing alphabetic character with any other alphabetic character.
  
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0){
            String str = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine().trim());
            Solution obj = new Solution();
            if(obj.kPangram(str, k))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean kPangram(String str, int k) 
    {
        // code here
        StringBuilder br = new StringBuilder();
        char a[] = str.toCharArray();
        int c = 0;
        
        for(int i =0; i <str.length(); i++)
        { 
            if( a[i] != ' ')
            {
                c++;
            }
            
            if( (a[i] != ' ') && (  !(br.toString().contains(str.substring(i,i+1)))   ) )
            {
                br.append(a[i]); 
            }
            
            
        }
        
        int distinct =  br.toString().length();
        
        int req = 26-distinct;
        
        if(c<26)
        return false;
        
       if(k >= req && distinct + k >= 26)
       return true;
        
       return false;
        
    }
}
