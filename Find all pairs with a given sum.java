GFG - Arrays

Find all pairs with a given sum

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long N = Long.parseLong(stt.nextToken());
            long M = Long.parseLong(stt.nextToken());
            long X = Long.parseLong(stt.nextToken());
            long A[] = new long[(int)(N)];
            long B[] = new long[(int)(M)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < N; i++) {
                A[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < M; i++) {
                B[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            pair [] answer = obj.allPairs(A, B, N, M, X);
            int sz = answer.length;
            
            if(sz==0)
            System.out.println(-1);
            else{
                StringBuilder output = new StringBuilder();
                for(int i=0;i<sz;i++){
                    if(i<sz-1)
                    output.append(answer[i].first +" "+ answer[i].second + ", ");
                    else
                    output.append(answer[i].first +" "+ answer[i].second);
                    
                }
                System.out.println(output);
            }
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        
        ArrayList<pair> ans = new ArrayList<>();
      
        // Your code goes here 
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0;i < N; i++)
        {
            for(int j = B.length-1; j >=0; j--)
            {
                if(A[i]+B[j] == X)
                {
                    ans.add(new pair(A[i], B[j]));
                  //  break;
                }
            }
        }
        
    int n = ans.size();
        
        pair p[] = new pair[n];
        
        for(int k=0; k<n; k++)
        {
            p[k] = new pair(ans.get(k).first, ans.get(k).second);
        }
        
        return p;
        
    }
}
