GFG -Algorithm

Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.
  
//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int mergeArr[] =new int[r-l+1];
         int k = 0;
         int ind1 = l;
         int ind2 = m+1;
         while(ind1 <= m && ind2 <= r)
         {
             
             if(arr[ind1] <= arr[ind2])
             {
                 mergeArr[k] = arr[ind1];
                 ind1++;
                 k++;
             }
             else
             {
                 mergeArr[k] = arr[ind2];
                 ind2++;
                 k++;
             }
             
             
         }
         
         while(ind1 <= m)
         {
              mergeArr[k] = arr[ind1];
                 ind1++;
                 k++;
         }
         
          
         while(ind2 <= r)
         {
              mergeArr[k] = arr[ind2];
                 ind2++;
                 k++;
         }
         
          for(int i=0,j=l;i<mergeArr.length;i++,j++){
          arr[j]=mergeArr[i];
         }
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
       if(l>=r)
        {
            return;
        }
        int mid = l+(r-l) /2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);  
    }
}
