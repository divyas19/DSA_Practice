GFG - Linked List

Given a doubly linked list, rotate the linked list counter-clockwise by P nodes. Here P is a given positive integer and is smaller than the count of nodes(N) in a linked
list.
  
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
	int data;
	Node next, prev;
	Node(int data){
		this.data = data;
		next = null;
		prev = null;
	}
}

class MaximumFrequency{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int p = Integer.parseInt(str[1]);
			
			Node start = null;
			Node cur = null;
			Node ptr = null;
			str = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++) {
				int a = Integer.parseInt(str[i]);
				ptr = new Node(a);
				if(start == null) {
					start = ptr;
					cur = ptr;
				}
				else {
					cur.next=ptr;
	                ptr.prev=cur;
	                cur=ptr;
				}
			}
			Solution obj = new Solution();
			Node node = obj.rotateDLL(start, p);
			while(true)
	        {
				System.out.print(node.data+" ");
	            if(node.next == null)
	            	break;
	            node = node.next;
	        }
	        while(node != null)
	        {
	        	System.out.print(node.data+" ");
	            node = node.prev;
	        }
	        System.out.println();
		}
	}
}// } Driver Code Ends


//User function Template for Java

/*
class Node{
	int data;
	Node next, prev;
	Node(int data){
		this.data = data;
		next = null;
		prev = null;
	}
}
*/

class Solution{
    
    	static void revOnce(Node head)
		{
		    int x = head.data;
		    Node temp = head;
		    while(temp.next != null)
		    {
		        temp.data = temp.next.data;
		        temp = temp.next;
		        
		    }
		   temp.data = x;
		}
		
    
    
    
	public Node rotateDLL(Node start, int p) {
		//Write your code here
	for(int i = 0; i< p; i++)
	{
	    revOnce(start);
	}
	
	return start;	
		
	}
}
