GFG - Array

Find a rotation with maximum hamming distance

/*package whatever //do not write package name here */
//
import java.util.*;
import java.math.*;

class GFG {
    
    void lone(int B[],int N)
		{
		    int t = B[0];
		    
		    for(int i = 0; i < N-1; i++)
		    {
		      B[i] = B[i+1];
		    }
		    B[N-1] = t;
		}
    
    static int maxHam(int A[],int B[],int N)
    {
         int max = 0;
               
		for(int i = 0;i <N-1; i++)
		{
		  //  obj.l_one(B,N);
                    GFG obj = new GFG();
                  int c = 0;
		    obj.lone(B,N);
		   
		    for(int j = 0; j <N;j++)
		    {
		        
		        
		        if(A[j] != B[j])
		        {
		            c++;
		        }
		        
		    }
		    if (c == N)
            return N;
 
        max = Math.max(max, c);
    }
 
    return max;
            
    }
    
	public static void main (String[] args) {
	   
	    Scanner sc = new Scanner(System.in);
	    int N;
	    System.out.println("Enter the no of elements");
	    N = sc.nextInt();
		int A[] = new int[N];
		System.out.println("Enter the elements");
		for(int i = 0; i < N ; i++)
		{
		    A[i] = sc.nextInt();
		}
		
		
		 int B[] = new int[N];
		    for(int k = 0 ; k<N; k++)
                    {
                        B[k]=A[k];
                    }
		    
		System.out.println(maxHam(A,B,N));
		   	
	}

}

