GFG - Array

Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array. The only operation allowed is to 
rotate(clock-wise or counter clock-wise) the array any number of times.
  
// { Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}
// } Driver Code Ends

class GfG
{
    
   int max_sum(int A[],int N)
   {
     int isum = 0,sum = 0;
     for(int i = 0; i < N; i++)
     {
         sum = sum + A[i];
        isum = isum + A[i]*i;
     }
     
     int max = isum;
     
     for(int i = 1; i < N; i++)
     {
         int summm;
         summm = isum - sum + A[i-1]*N;
         isum = summm;
         
         if(summm > max)
         {
             max = summm;
         }
     }
     
     
     return max;
     
     
   }
}   
 


//Old Approach

// void l_one(int a[],int N)
// {
//   int t = a[0];

//   for(int i = 0; i < N-1; i++) 
//   {
      
//       a[i] = a[i+1];
     
//   }

//   a[N-1] = t;
// }

// int Sum_one(int A[],int N)
// {
//   int sum = 0;
// for(int i = 0; i < N; i++)
// {
//     sum = sum + A[i]*i;
// }

// return sum;
// }
  
// int max_sum(int A[],int N)
// {
// //Your code here
// int B[] = new int[N];
// Arrays.sort(B);
// if(Arrays.equals(B, A))
// {
//     return Sum_one(A,N);
// }
// else{

// int max = 0;

// for(int i = 0; i < N;i++)
// {
//     l_one(A,N);
//     int val = Sum_one(A,N);
  
//     if(val > max)
//     {
//         max = val;
//     }
// }

// return max;

// }
// }

