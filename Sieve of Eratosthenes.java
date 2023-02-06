GFG - Logic

Given a number N, calculate the prime numbers up to N using Sieve of Eratosthenes.  
  
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        // code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        boolean a[] = new boolean[N+1];
        Arrays.fill(a,true);
        a[0]=false;
        a[1] = false;
        for(int i = 2; i*i <= N;i++)
        {
            for(int j = 2*i; j <=N;j+=i)
            {
                a[j] = false;
            }
        }
        for(int i = 0; i <N+1;i++)
        {
            if(a[i]==true)
            al.add(i);
        }
        return al;
    }
}

