GFG - Linked List

//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node reverse(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node prev = head;
        Node cur = head.next;
        while(cur!= null)
        {
            Node nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;
        }
        head.next = null;
        return prev;
        
    }
    Node compute(Node head)
    {
        // your code here
        
         if(head == null|| head.next == null)
        {
            return head;
        }
        
        Node reversed = reverse(head);
        Node rev =reversed;
        int max = rev.data;
        Node prev = rev;
        Node cur = rev.next;
        while(cur!= null)
        {
            if(cur.data<max)
            {
                prev.next = cur.next;
                cur=cur.next;
            }
            else
            {
                max = cur.data;
                prev = cur;
                cur = cur.next;
            }
        }
       Node ans = reverse(rev);
       return ans;
    }
    
}
  
