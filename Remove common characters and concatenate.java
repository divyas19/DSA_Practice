//GFG - HashMap, Strings

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}

// } Driver Code Ends




class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
//         // Your code here


 HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
    
        
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            h1.put(ch,1);
        }
        
        
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            h2.put(ch,1);
        }
        
        String con = s1+s2;
        StringBuilder res = new StringBuilder();
        int n = con.length();
        // String res = "";
        
        for(int i=0;i<n;i++){
            char ch = con.charAt(i);
            if(!h1.containsKey(ch) && h2.containsKey(ch) || 
            !h2.containsKey(ch) && h1.containsKey(ch)){
                
                res.append(ch);
                
            }
            
        }
        
        
        
        return res.toString().isEmpty()?"-1":res.toString();
    }
}

// ____________________________________________________________________________________________________________
//          String ans2 = "";
//           String ans1="";
         
//          String not="";
//         HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
//         for(int i=0; i < s1.length(); i++)
//         {
//             char ch = s1.charAt(i);
//             if(hm1.containsKey(ch))
//             {
//                 hm1.put(ch,hm1.get(ch)+1);
//             }
//             else
//             {
//                 hm1.put(ch,1);
//             }
//         }
        
//         for(int j=0; j < s2.length(); j++)
//         {
//             char ch = s2.charAt(j);
//             if(hm1.containsKey(ch))
//             {
//                 hm1.put(ch,0);
//                 not+=ch;
//             }
//             else
//             {
//                 ans2+=ch;
//             }
//         }
        
//         if(hm1.size()==0)
//         {
//             return "-1";
//         }
        
//          for(int i=0; i < s1.length(); i++)
//          {
//              String check = String.valueOf(s1.charAt(i));
//              if(!not.contains(check))
//              {
//                 ans1+=check;
//              }
//          }
        
        
//         String ans = ans1+ans2;
       
      
//         return ans;
//     }
// }

       
