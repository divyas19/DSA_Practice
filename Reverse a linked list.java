GFG - Linked List

Given a linked list of N nodes. The task is to reverse this list.
  
// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        
        	int n = sc.nextInt();
        
            Node head = new Node(sc.nextInt());
            Node tail = head;
        
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
        
            Solution ob = new Solution();
            head = ob.reverseList(head);
            printList(head); 
            t--;
        }
    } 
} 
   // } Driver Code Ends


//function Template for Java

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node t = head;
        Node temp = head;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        while(t!=null)
        {
            ar.add(t.data);
            t = t.next;
        }
        Collections.reverse(ar);
        int i = ar.size()-1;
        Node ans = new Node(-1);
        Node cur = ans;
        for(Integer v : ar)
        {
            Node n = new Node(v);
            cur.next = n;
            cur = cur.next;
        }
        return ans.next;
    }
}
