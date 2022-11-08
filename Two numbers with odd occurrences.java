GFG - Arrays

Given an unsorted array, Arr[] of size N and that contains even number of occurrences for all numbers except two numbers. Find the two numbers in decreasing order which 
has odd occurrences.
  
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        TreeSet<Integer> s = new TreeSet<>(Collections.reverseOrder());
        
        for(int v : Arr)
        {
            if(s.contains(v))
            {
                s.remove(v);
            }
            else{
                s.add(v);
            }
        }
        
        int ans[] =  new int[s.size()];
        int x = 0;
        for(int i : s) ans[x++] = i;
        return ans;
//         HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//         Arrays.sort(Arr);
//       int ans[] = new int[2];
//       for (int c : Arr){
//          if (hm.containsKey(c)){
//             hm.put(c, hm.get(c) + 1);
//          }else{
//             hm.put(c, 1);
//          }
//       }
//       int ct =1;
//       Iterator iterator = hm.entrySet().iterator();
//      while (iterator.hasNext()) 
// {
//     int t = hm.get(iterator.next());
//     if(t%2 !=0)
//     {
//         ans[ct--] = t;
//     }

// }

//       return ans;
   }
  
}
