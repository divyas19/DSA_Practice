GFG - Linked List

Given a linked list of size N and a key. The task is to insert the key in the middle of the linked list.
  
// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();   
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            
            //display(head);
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
    }
    
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
// } Driver Code Ends


/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node in = new Node(data);
        int p = 0;
     Node t = head;
     int c = 0;
     if(head == null )
     return head;
     
     
     while(t != null)
     {
         t = t.next;
         c++;
     }
     
     if(c%2 == 0)
     {
         p = c/2 + 0;
     }
     else
     {
         p = c/2 + 1;
     }
     
     Node temp = head;
     for(int i = 1; i < p; i++)
     {
         temp = temp.next;
     }
     Node nxt = temp.next;
     temp.next = in;
     in.next = nxt;
     return head;
     
    }
}
