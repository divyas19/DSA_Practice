GFG - String

Given a string S. The task is to print all unique permutations of the given string in lexicographically sorted order.
  
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
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends


class Solution {
    
    
        static String swap(String S, int l,int i)
        {
           
            char c[]=S.toCharArray();
            char t=c[l];
            c[l]=c[i];
            c[i]=t;
            return String.valueOf(c);
        }
        
        static void permutate(String S, int l,int r,List<String> list)
        {
            if(l==r)
            {
                if(!list.contains(S))
                list.add(S);
                return;
            }
            
            for(int i = l; i <=r;i++)
            {
            S = swap(S,l,i);
            permutate(S,l+1,r,list);
            S = swap(S,l,i);
            }
        }
        
        public List<String> find_permutation(String S) {
        // Code here
        int l =0;
        int r = S.length()-1;
        List<String> list = new ArrayList<String>();
        permutate(S,l,r,list);
        Collections.sort(list);
        return list;
    }
}
