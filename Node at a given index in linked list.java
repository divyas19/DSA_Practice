GFG - Linked List

Given a singly linked list with N nodes and a number X. The task is to find the node at the given index (X)(1 based index) of linked list. 

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains space seperated two integers, length of linked list and X.

Output:
For each testcase, there will be single line of output containing data at Xth node.

User Task:
The task is to complete the function GetNth() which takes head reference and index as arguments and should return the data at Xth position in the linked list.
  
// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}


class nthNode
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
           GfG gfg = new GfG();
           System.out.println(gfg.getNth(head, k));
        }
    }
    
    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
                temp.next = node;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
    //   if(node == null)
    //   return -1;
       
       if(ind == 1)
       {
           return node.data;
       }
       Node t = node;
       int c = 1;
       while(c!= ind)
       {
           t = t.next;
           c++;
       }
       
       return t.data;
    }
}
