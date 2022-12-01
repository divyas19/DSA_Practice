GFG - Linked List

Given only a pointer to a node to be deleted in a singly linked list. Print the whole Linked List after deletion.

Input:
The first line of input contains an element T, denoting the no of test cases. Then T test cases follow. Each test case contains two lines. The first line of each test 
case contains two integers N denoting the no of elements of the linked list and P denoting the number of the node which is to be deleted (starting from 0) . Then in the 
next line are N space separated values of the linked list.

Output:
The output for each test case will be the space separated elements of the updated linked list.
  
//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.Scanner; 
class Node {
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}
public class LinkedList{
    public static Node cur2=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Node head=null;
            Node cur=null;
        int n=sc.nextInt();
        int p=sc.nextInt();
        cur=null;
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            Node ptr=new Node(d);
            if(head==null)
            {
                head=ptr;
                cur=ptr;
            }
            else
            {
                cur.next=ptr;
                cur=ptr;
            }
        }
        cur2=head;
        while(p-->0)
        {
            cur2=cur2.next;
        }
        GfG g=new GfG();
        g.deleteNode(cur2);
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
        }
    }
}

// } Driver Code Ends
//User function Template for Java


class GfG 
{
    public void deleteNode(Node node) {
        //Add your code here
        if(node.next == null)
        return ;
 node.data = node.next.data;
 node.next = node.next.next;
    }
}

//{ Driver Code Starts.
// } Driver Code Ends
