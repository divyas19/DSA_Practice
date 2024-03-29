GFG - Array

Given an array H representing heights of buildings. You have to count the buildings which will see the sunrise (Assume : Sun rise on the side of array starting point).
  
// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] h = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(inputLine[i]);
            }


            int ans = new Solution().countBuildings(h, n);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java



class Solution {
    int countBuildings(int h[], int n) {
        // code here
        int min = h[0];
        int ans = 1;
        for(int i = 1;i <n; i++)
        {
            if(h[i]>min)
            {
                ans+=1;
                min = h[i];
            }
        }
        return ans;
    }
}
