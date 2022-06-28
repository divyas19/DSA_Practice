GFG - Array

Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 
  
// { Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        for(int i = 0; i+3 <= n;i++)
        {
            for(int j = i+1;j < n;j++)
            {
                for(int k = j+1; k < n;k++)
                {
                    // System.out.print((arr[i]+arr[j]+arr[k])+"    ");
                    if((arr[i]+arr[j]+arr[k] )== 0)
                    {
                    // System.out.print(arr[i]+i+"    ");
                    // System.out.print(arr[j]+j+"    ");
                    // System.out.println(arr[k]+k);
                    return true;
                    }
                }
            }
        }
        return false;
    }
}
