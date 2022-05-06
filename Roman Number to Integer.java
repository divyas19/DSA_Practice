GFG - String

Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
  
// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
        static int con(char s){
        if(s=='I')
            return 1;
        else if(s=='V')
            return 5;
        else if(s=='X')
            return 10;
        else if(s=='L')
            return 50;
        else if(s=='C')
            return 100;
        else if(s=='D')
            return 500;
        else if(s=='M')
            return 1000;
        return -1;
    }
    
    public int romanToDecimal(String str) {
       int s=0;
        for(int i=0;  i<str.length()-1; i++){
            int  p =con(str.charAt(i));
            int  n =con(str.charAt(i+1));
            if(p>=n){
                s= s+ con(str.charAt(i));
            }
            else {
                s=s- con(str.charAt(i));
            }
        }
        
        s = s + con(str.charAt(str.length()-1));
        return s;
        
    }

}
