GFG - Linked List

Given a singly linked list: A0→A1→…→An-1→An, reorder it to: A0→An→A1→An-1→A2→An-2→…
For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.
Note: It is recommended do this in-place without altering the nodes' values.
  
Note: It is recommended do this in-place without altering the nodes' values.
  
// { Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            llist.head = new gfg().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class gfg {
    Node reorderlist(Node head) {
        // Your code here
        Node t = head;
        int c = 0;
        while(t != null)
        {
            t = t.next;
            c++;
        }
        
        int k = 0;
        if(c%2==0)
        k= c/2;
        else
        k= c/2 + 1;
    
    
    ArrayList<Integer> a= new ArrayList<Integer>();
    Node tempa = head;
    for(int i = 0; i < k ;i++)
    {
    a.add(tempa.data);
    tempa = tempa.next;
    }
    // System.out.println(a);
    
    ArrayList<Integer> b= new ArrayList<Integer>();
    Node tempb = tempa;
    for(int j = k; j < c ;j++)
    {
    b.add(tempb.data);
    tempb = tempb.next;
    }
    Collections.reverse(b);
    // System.out.println(b);
    
    Node ans = new Node(-1);
    Node cur = ans;
     int ai = 0;
      int bi = 0;
    for(int g = 0; g < c; g++)
    {
    if(g % 2 == 0)
    {
        Node add = new Node(a.get(ai));
        cur.next = add;
        cur = cur.next;
        ai++;
        
    }
    else if(g % 2 != 0)
    {
        Node add = new Node(b.get(bi));
         cur.next = add;
        cur = cur.next;
        bi++;
    }
    }
    
    return ans.next;
}
}
