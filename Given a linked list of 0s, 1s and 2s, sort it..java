GFG - Linked List

Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to 
head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.
  
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int ct0 =0,ct1 =0,ct2=0;
        Node t= head;
        Node temp= head;
        while(t != null)
        {
            if(t.data ==0)
            ct0++;
            else if(t.data == 1)
            ct1++;
            else
            ct2++;
            t = t.next;
        }
        while(temp!= null&&ct0>0)
        {
           
            temp.data  = 0;
            ct0--;
             temp = temp.next;
        }
        while(temp!= null&&ct1>0)
        {
           
            temp.data  = 1;
            ct1--;
             temp = temp.next;
        }
        while(temp!= null&&ct2>0)
        {
           
            temp.data  = 2;
            ct2--;
             temp = temp.next;
        }
        
        return head;
    }
}


