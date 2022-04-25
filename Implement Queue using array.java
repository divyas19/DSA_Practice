GFG - Array

Implement a Queue using an Array. Queries in the Queue are of the following type:
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop element from queue and print the poped element)
  
 // { Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}



// } Driver Code Ends




class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
	

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	
	
	//Function to push an element x in a queue.
// 	void pushI(int x, int arr[])
// 	{
// 	    // Your code here
	   
// 	    arr[rear] = x;
// 	    rear++;
	    
	   
// 	} 

// 	void push(int x)
// 	{
// 	    // Your code here
// 	     arr[rear] = x;
// 	    rear++;
	  
// 	} 
	
	void push(int x)
	{
	     arr[rear] = x;
	    rear++;
	  
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(front == rear )
		{
		    return -1;
		}
		
		    int v = arr[front];
		    front++;
		    return v;
		    
	
	} 
}




