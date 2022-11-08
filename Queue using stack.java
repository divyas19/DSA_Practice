GFG - Queue

Implement a Queue using two stack s1 and s2.
  
//{ Driver Code Starts
import java.util.*;


class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queue g = new Queue();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.enqueue(a);
				}
				else if(QueryType == 2)
				System.out.print(g.dequeue()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends


class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(input.size()==0)
	    return -1;
	    int t = input.pop();
	    return t;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here
	   if(input.isEmpty())
	   input.add(x);
	   else{
	   while(!input.isEmpty())
	   {
	       output.add(input.peek());
	       input.pop();
	   }
	   input.add(x);
	   while(!output.isEmpty())
	   {
	       input.add(output.peek());
	       output.pop();
	   }
	   
	   }
	  
    }
}

