GFG - Array

Pitsy needs help with the given task by her teacher. The task is to divide an array into two sub-array (left and right) containing n/2 elements each and do the sum of the
subarrays and then multiply both the subarrays.

Note: If the length of the array is odd then the right half will contain one element more than the left half.
  
// { Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

int multiply(int arr[], int n);


int main() {
	//code
	int t;
	cin>>t;
	while (t--)
	{
	    int n,sum1=0,sum2=0;
	    cin>>n;
	    int a[n];
	    for(int i=0;i<n;i++)
	        cin>>a[i];
	    
	    cout << multiply(a, n) << endl;
	    
	}
	return 0;
}// } Driver Code Ends


//User function Template for C++

int multiply(int arr[], int n)
{
    // Complete the function
    
    int res = 0;
    
    if(n%2 ==0)
    {
        int suml = 0, sumr = 0;
        
        for(int i = 0 ; i < n/2; i++)
        {
            suml+= arr[i];
        }
        
        for(int j = n/2 ; j < n; j++)
        {
            sumr+= arr[j];
        }
        
        res = suml*sumr;
        return res;
    }
    else
    {
        int suml = 0, sumr = 0;
        
        for(int i = 0 ; i < n/2; i++)
        {
            suml+= arr[i];
        }
        
        for(int j = n/2 ; j < n; j++)
        {
            sumr+= arr[j];
        }
        
        res = suml*sumr;
          return res;
    }
    
  
    
}
