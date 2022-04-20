GFG - Array

Given a random set of numbers, Print them in sorted order.
  
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
       //code here
       Arrays.sort(arr);
       return arr;
    }
    
} 
   

//     void swap(int arr[],int n,int i)
//         {
//             int t= arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1] = t;
//         }
    
//     int[] sortArr(int[] arr, int n) 
//     { 
        
//         for(int j = 0; j < n-1; j++)
//          {
//         //for(int i = 0,j = 0; i < n-1 && j < n-1; i++, j++)
//          for(int i = 0; i < n-1; i++)
//         {
//             if(arr[i] > arr[i+1])
//             {
//                 // int t= arr[i];
//                 // arr[i] = arr[i+1];
//                 // arr[i+1] = t;
//                 swap(arr,n,i);
//             }
        
//         }
        
//         }
//         return arr;
//     }
    
//  } 
 
 
