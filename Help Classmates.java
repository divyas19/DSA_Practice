GFG - Stack

Professor X wants his students to help each other in the chemistry lab. He suggests that every student should help out a classmate who scored less marks than him in 
chemistry and whose roll number appears after him. But the students are lazy and they don't want to search too far. They each pick the first roll number after them that 
fits the criteria. Find the marks of the classmate that each student picks.
Note: one student may be selected by multiple classmates.
  
//{ Driver Code Starts
//Initial Template for Java


import java.util.*; 
import java.io.*; 

class GFG 
{ 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            int ans[] = ob.help_classmate(array,n);

           	for (int i=0; i<n; i++) 
                System.out.print(ans[i]+" "); 
            System.out.println();
            t--;
        }
	} 
} 


// } Driver Code Ends


//User function Template for Java

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    int ans[] = new int[n];
        for(int i = 0; i < arr.length-1; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                ans[i] = arr[j];
                break;
                }
                if(j == arr.length -1)
                ans[i] = -1;
            }
            
        }
        ans[arr.length-1] =-1;
        return ans;
	} 
}
