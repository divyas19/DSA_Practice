GFG - Linked List

Given a Circular Linked List of size N. The task is to delete the given node (excluding the first and last node) in the circular linked list and then print the reverse of
the circular linked list.
  
// { Driver Code Starts
import java.util.Scanner;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class GFG1 {
    public static void printList(Node head)
    {
        Node start=head;
        System.out.print(head.data+" ");
        head=head.next;
        while(head!=start)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        Node start=null,cur=null;
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            Node ptr=new Node(a);
	            if(start==null)
	            {
	                start=ptr;
	                cur=ptr;
	            }
	            else
	            {
	                cur.next=ptr;
	                cur=ptr;
	            }
	        }
	        int delNode=sc.nextInt();
	        cur.next=start;
	        GFG obj=new GFG();
	        Node head=obj.deleteNode(start,delNode);
	        start=obj.reverse(head);
	        printList(start);
	    }
	}
}// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}*/

class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        //Add your code here.
        Node q = head;
        Node t = head.next;
        while(t.data != d)
        {
            q = t;
            t = t.next;
        }
        q.next = t.next;
        return head;
        
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        //Add your code here
    //     if(head.next == head)
    //     {
    //         return head;
    //     }
    //     if(head.next.next == head)
    //     {
    //   Node te = head.next;
    //   te.next = head;
    //   head.next = te;
    //   head = te;
    //   return head;
            
    //   }
        Node prev = head;
        Node cur = head.next;
       
       while(cur != head){
       Node temp = cur.next; 
        cur.next = prev;
        prev = cur;
        cur = temp;
       }
       cur.next = prev;
       head = prev;
       return head;
    }
        
}
