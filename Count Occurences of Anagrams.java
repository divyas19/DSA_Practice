GFG - String 

Given a word pat and a text txt. Return the count of the occurrences of anagrams of the word in the text.

Example 1:

Input:
txt = forxxorfxdofr
pat = for
Output: 3
Explanation: for, orf and ofr appears
in the txt, hence answer is 3.

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        List<Integer> l = new ArrayList<Integer>();
        int i =0;
        int j =0;
        
        int k = pat.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int m = 0; m < pat.length() ; m++)
        {
            hm.put(pat.charAt(m), hm.getOrDefault(pat.charAt(m),0)+1);
        }
        
        int ct = hm.size();
        
        while(j < txt.length())
        {
            if(hm.containsKey(txt.charAt(j)))
            {
                 hm.put(txt.charAt(j), hm.get(txt.charAt(j))-1);
                 if(hm.get(txt.charAt(j)) == 0)
                 ct--;
            }
            
            if(j-i+1 < k)
            {
                j++;
            }
            else if( j-i+1 == k)
            {
                if(ct == 0)
                l.add(i);
                
                if(hm.containsKey(txt.charAt(i)))
                {
                     if(hm.get(txt.charAt(i)) == 0)
                    ct++;
                    hm.put(txt.charAt(i), hm.get(txt.charAt(i))+1);
                    
                   
                }
                j++;
                i++;
            }
        }
        return l.size();
    }
}
