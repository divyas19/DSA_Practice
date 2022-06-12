GFG - Linked List

Exchange first and last nodes in Circular Linked List.
  
class LinkedList
{
    
    
Node head;
public class Node
{
    int data;
    Node next;
    
    Node(int d)
    {
        data = d;
        next = null;
    }
}

void push(int data)
{
    Node add = new Node(data);
   add.next = head;
   head = add;
   
}

void printList()
{
    Node te= head;
    while(te != null)
    {
        System.out.print(te.data +" ");
        te = te.next;
    }
    System.out.println();
}

void lastToFront()
{
    Node prev = head;
    Node cur = prev.next;
    while(cur.next != null)
    {
        prev = cur;
        cur = cur.next;
    }
    prev.next = null;
    cur.next = head;
    head = cur;
    
}

public static void main(String args[])
{
    LinkedList ll = new LinkedList();
    ll.push(4);
    ll.push(3);
    ll.push(2);
    ll.push(1);
    ll.printList();
    
    ll.lastToFront();
    
    ll.printList();
}


}
