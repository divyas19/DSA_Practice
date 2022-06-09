GFG - Linked List

Given a sorted circular linked list, the task is to insert a new node in this circular list so that it remains a sorted circular linked list.
  
// { Driver Code Starts
//Code by:Saksham Raj Seth
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
class LL{
Node head;
Node tail;
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            LL llist = new LL();
			llist.head=null;
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
			int value=sc.nextInt();
			Node phead=head;
			while(phead.next!=null){
				phead=phead.next;
			}
			phead.next=head;
            Solution ob=new Solution();
			head = ob.sortedInsert(head,value);
			Node current = head;
			
			if(head != null){
			    do{
			        System.out.print(current.data+" ");
			        current = current.next;
			    }while(current != head);
			}
			System.out.println();
        }
    }
}// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}*/
class Solution
{
	public static Node sortedInsert(Node head,int data)
         {
            //add code here.
            Node add = new Node(data);
            
            Node te = head;
            if(te == null)
            {
                add.next = add;
                head = add;
                return head;
            }
            if(add.data <= te.data)
            {
                add.next = te;
             
               while(te.next != head)
               {
                   te = te.next;
               }
               te.next = add;
               head = add;
              return head;
            }
             else{ 
        
        
            Node t = head.next;
            
            while( t.data <= add.data && t!= head)
            {
           
                t = t.next;
            }
            int temp = t.data;
            t.data = add.data;
             add.next = t.next;
            t.next = add;
             add.data = temp;
             
        
            
          return head;
         } 
         }
}
